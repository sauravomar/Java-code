package com.ril.slot;

import java.util.ArrayList;
import java.util.List;

public class CoinChange {

	public static long getWays(int n, int index, List<Long> list) {
		int table[] = new int[n + 1];

		// Base case (If given value is 0)
		table[0] = 1;

		for (int i = 0; i < list.size(); i++)
			for (int j = Math.toIntExact(list.get(i)); j <= n; j++) {
				System.out.println(j - Math.toIntExact(list.get(i)));
				table[j] += table[j - Math.toIntExact(list.get(i))];
			}

		return table[n];

	}

	public static long getWays(int n, List<Long> list) {
		return getWays(n, 0, list);
	}

	public static void main(String[] args) {
		List<Long> arr = new ArrayList<Long>();
		arr.add(1L);
		arr.add(2L);
		arr.add(3L);
		System.out.println(getWays(4, arr));
	}
}
