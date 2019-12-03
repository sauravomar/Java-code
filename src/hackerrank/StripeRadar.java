package com.ril.slot;

import java.util.ArrayList;
import java.util.List;

public class StripeRadar {

	public static boolean should_allow_charge(List<String> charge_and_rules) {

		String charge[] = charge_and_rules.get(0).replace("CHARGE:", "").split("&");

		String cardCountry = getChargeParam(charge, "card_country");
		Long amount = Long.parseLong(getChargeParam(charge, "amount"));
		String currency = getChargeParam(charge, "currency");
		String ipCountry = getChargeParam(charge, "ip_country");

		List<String> allow = getRules(charge_and_rules, "ALLOW:");
		List<String> block = getRules(charge_and_rules, "BLOCK:");

		boolean result = false;

		for (String rule : allow) {
			result = evaluate(rule, cardCountry, amount, currency, ipCountry);
			if (result)
				return true;
		}

		for (String rule : block) {
			result = evaluate(rule, cardCountry, amount, currency, ipCountry);
			if (result)
				return false;
		}

		return true;
	}

	private static List<String> getRules(List<String> charge_and_rules, String rule) {

		List<String> rules = new ArrayList<String>();

		for (String str : charge_and_rules) {
			if (str.startsWith(rule)) {
				rules.add(str.replace(rule, "").trim());
			}
		}

		return rules;
	}

	private static String getChargeParam(String charge[], String param) {

		for (String str : charge) {
			if (str.trim().startsWith(param)) {
				return str.replace(param + "=", "").trim();
			}
		}

		return null;
	}

	public static boolean evaluate(String rule, String cardCountry, long amt, String currency, String ipCountry) {

		String rules[] = { rule };

		if (rule.contains("AND")) {
			rules = rule.split("AND");
		}

		for (String str : rules) {
			String orRules[] = { str };

			if (str.contains("OR")) {
				orRules = rule.split("OR");
			}

			boolean result = checkOrCond(cardCountry, amt, currency, ipCountry, orRules);
			if (!result)
				return false;
		}

		return true;

	}

	private static boolean checkOrCond(String cardCountry, long amt, String currency, String ipCountry,
			String[] orRules) {
		for (String or : orRules) {

			if (or.contains("==")) {
				String param[] = or.split("==");
				boolean result = evaluate(param[0].trim(), param[1].trim(), cardCountry, amt, currency, ipCountry);
				if (result)
					return true;
			} else {
				String param[] = or.split("!=");
				boolean result = evaluate(param[0].trim(), param[1].trim(), cardCountry, amt, currency, ipCountry);
				if (!result)
					return true;
			}
		}
		return false;
	}

	public static boolean evaluate(String param, String value, String cardCountry, long amt, String currency,
			String ipCountry) {

		switch (param) {
		case "card_country":
			if (value.equalsIgnoreCase("ip_country"))
				return isCheck(ipCountry, cardCountry);
			else
				return isCheck(cardCountry, value);
		case "amount":
			return isCheck(amt, Long.parseLong(value));
		case "currency":
			return isCheck(currency, value);
		case "ip_country":
			return isCheck(ipCountry, value);

		default:
			return false;
		}

	}

	public static boolean isCheck(String expected, String present) {
		return expected.equalsIgnoreCase(present);
	}

	public static boolean isCheck(long expected, long present) {
		return expected == present;
	}

	public static void main(String[] args) {
		List<String> charge_and_rules = new ArrayList<String>();
		charge_and_rules.add("CHARGE: card_country=US&currency=USD&amount=150&ip_country=US");
		charge_and_rules.add("ALLOW: card_country == ip_country");
//		charge_and_rules.add("ALLOW: ip_country == US");
//		charge_and_rules.add("BLOCK: card_country == CA");
		System.out.println(should_allow_charge(charge_and_rules));
	}

}
