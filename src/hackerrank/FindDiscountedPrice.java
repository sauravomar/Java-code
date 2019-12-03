package com.ril.slot;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindDiscountedPrice {

	public static void finalPrice(List<Integer> prices) {

		int[] minLeftEle = new int[prices.size()];

		StringBuilder sb = new StringBuilder();
		int sum = 0;

		int min = prices.get(prices.size() - 1);
		minLeftEle[prices.size() - 1] = min;

		for (int i = prices.size() - 2; i >= 0; i--) {
			if (min > prices.get(i)) {
				min = prices.get(i);
			}
			minLeftEle[i] = min;

		}

		for (int i = 0; i < prices.size(); i++) {
			if (prices.get(i) > minLeftEle[i]) {
				sum = sum + prices.get(i) - minLeftEle[i];
			} else if (prices.get(i) < minLeftEle[i]) {
				sum = sum + prices.get(i);
				sb.append(prices.get(i)).append(" ");
			} else if (prices.get(i) == minLeftEle[i]) {
				if (i < prices.size() - 1 && minLeftEle[i] != minLeftEle[i + 1]) {
					sum = sum + prices.get(i);
					sb.append(i).append(" ");
				} else if (i == prices.size() - 1) {
					sum = sum + prices.get(i);
					sb.append(i).append(" ");
				} else {
					sum = sum + prices.get(i) - minLeftEle[i];
				}
			}
		}

		System.out.println(sum);
		System.out.println(sb.toString());

	}

	static void findContinuousNextLowest(List<Integer> prices) {
		
		 int [] discounts = new int[prices.size()];
		    Stack<Integer> stack = new Stack<Integer>();
		    for (int i = prices.size() - 1; i >= 0; i--) {
		        while (!stack.isEmpty() && stack.peek() > prices.get(i))
		            stack.pop();
		        if (!stack.isEmpty())
		            discounts[i] = stack.peek();
		        stack.push(prices.get(i));
		    }
		    int total = 0; // long type to avoid overflows
		    StringBuilder sb = new StringBuilder();
		    for (int i = 0; i < prices.size(); i++) {
		        total += prices.get(i) - discounts[i];
		        if (discounts[i] == 0)
		            sb.append(i).append(" ");
		    }
		    System.out.printf("%s\n%s\n", total, sb.toString().trim());
	}

	public static void main(String[] args) {
		List<Integer> minLeftEle = new ArrayList<Integer>();
//		minLeftEle.add(5);
		minLeftEle.add(1);
		minLeftEle.add(3);
		minLeftEle.add(3);
		minLeftEle.add(2);
		minLeftEle.add(5);
		new FindDiscountedPrice().findContinuousNextLowest(minLeftEle);
	}
}
