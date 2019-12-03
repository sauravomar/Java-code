package com.ril.slot;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocklate {

	// Complete the birthday function below.
	static int birthday(List<Integer> s, int d, int m) {
		int count = 0;

		int sum[] = new int[s.size()+1];

		for (int i = 0; i < s.size(); i++)
			sum[i + 1] = sum[i] + s.get(i);
		for (int i = 0; i <= s.size() - m; i++) {
			if (sum[i + m] - sum[i] == d) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(2);

		System.out.println(BirthdayChocklate.birthday(list, 3, 2));
	}
}
