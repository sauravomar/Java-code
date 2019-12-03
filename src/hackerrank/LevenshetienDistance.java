package com.ril.slot;

public class LevenshetienDistance {

	public static int calculate(String from, String to) {

		if (from.equals(to))
			return 0;
		
		if(from.length() == 0) return to.length();
		if(to.length() == 0) return from.length();

		if (from.charAt(0) == to.charAt(0))
			return calculate(from.substring(1), to.substring(1));

		return 1 + Math.min(calculate(from.substring(1), to.substring(1)),
				Math.min(calculate(from.substring(1), to), calculate(from, to.substring(1))));

	}

	public static void main(String[] args) {
		System.out.println(LevenshetienDistance.calculate("geek", "gesek"));
	}
}
