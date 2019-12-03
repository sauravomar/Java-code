package com.ril.slot;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {

	static int migratoryBirds(List<Integer> arr) {

		int countArr[] = new int[5];

		for (int i = 0; i < arr.size(); i++) {
			countArr[arr.get(i)-1]++;
		}

		int number = 1;
		int max = countArr[0];

		for (int i = 1; i < 5; i++) {
			if (max < countArr[i]) {
				max = countArr[i];
				number = i + 1;
			}
		}

		return number;

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(5);
		list.add(3);
		System.out.println(migratoryBirds(list));
	}
}
