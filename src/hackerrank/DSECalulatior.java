package com.ril.slot;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class DSECalulatior {

	class TradeVal {
		double share;
		double amount;

		public TradeVal(double total, double amount) {
			super();
			this.share = total;
			this.amount = amount;
		}

	}

	public static String calculateTax(List<String> trades) {

		double profit = 0;
		double negativeShare = 0;
		double negativeProfit = 0;

		List<TradeVal> tradeVal = new ArrayList<DSECalulatior.TradeVal>();

		for (String trade : trades) {

			String[] fields = trade.split(",");

			if (!fields[0].startsWith("2015"))
				continue;

			double share = Double.parseDouble(fields[3].trim());
			double value = Double.parseDouble(fields[4].trim());

			if (fields[2].trim().equalsIgnoreCase("B")) {
				if (negativeShare > 0) {
					if (share < negativeShare) {
						profit = profit + share * (negativeProfit - value);
						negativeShare = negativeShare - share;
						continue;

					} else {
						profit = profit + negativeShare * (negativeProfit - value);
						share = share - negativeShare;

					}
				}
				tradeVal.add(new DSECalulatior().new TradeVal(share, value));

			} else {
				int start = 0;
				while (start < tradeVal.size()) {
					TradeVal val = tradeVal.get(start);
					if (val.share > share) {
						profit = profit + (value - val.amount) * share;
						val.share = val.share - share;
						share = 0;
						break;
					} else {
						profit = profit + (value - val.amount) * val.share;
						share = share - val.share;
						tradeVal.remove(start);
					}
				}

				if (share > 0) {
					negativeShare = share;
					negativeProfit = value;
				}
			}
		}

		profit = 0.25 * profit;
		DecimalFormat df = new DecimalFormat("0.00");
		String result = "$" + df.format(profit);
		if (profit < 0)
			result = "(" + result + ")";

		return result;

	}

	public static void main(String[] args) {
		List<String> trade = new ArrayList<String>();
		trade.add("2015-01-03,AAPL,B,50,80.0");
		trade.add("2015-01-05,AAPL,B,60,100.0");
		trade.add("2015-02-05,AAPL,S,70,130.0");
		trade.add("2015-02-08,AAPL,S,10,90.0");
		trade.add("2015-03-10,AAPL,S,80,120.0");
		trade.add("2015-03-10,AAPL,B,10,70.0");
		trade.add("2015-04-08,AAPL,B,70,160.0");

		System.out.println(calculateTax(trade));

	}

}
