package com.ril.slot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MagicSquare {

	public static int pickingNumbers(List<Integer> a) {

		int count = 0;
		int max = 0;
		Collections.sort(a);

		for (int i = 0; i < a.size() - 1; i++) {
			if (a.get(i + 1) - a.get(i) <= 1) {
				int start = i;
				int index = i + 1;
				count = 1;
				while (index < a.size() && a.get(index) - a.get(start) <= 1) {
					count++;
					index++;
				}

				if (count > max)
					max = count;
			}
		}

		return max;
	}

	static int formingMagicSquare(int[][] s) {

		int count = 0;

		int arr[] = new int[9];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[s[i][j] - 1]++;
			}
		}

		int indexFirst = 0;
		int indexSecond = 0;
		int index = 0;

		while (index < arr.length) {

			if (arr[index] == 0) {
				indexFirst = index;
				indexSecond = index + 1;
				while (indexSecond < arr.length && !(arr[indexSecond] > 1)) {
					indexSecond++;
				}

				count = count + indexSecond - indexFirst;
				arr[indexFirst]++;
				arr[indexSecond]--;

			} else if (arr[index] > 1) {
				indexFirst = index;
				indexSecond = index + 1;
				while (indexSecond < arr.length && arr[indexSecond] != 0) {
					indexSecond++;
				}
				count = count + indexSecond - indexFirst;
				arr[indexFirst]--;
				arr[indexSecond]++;

				if (arr[index] != 0)
					continue;
			}
			index++;

		}

		return count;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 4, 6, 5, 3, 3, 1 };
		List<Integer>list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(4);
		list.add(5);
		list.add(5);
		list.add(5);

		System.out.println(pickingNumbers(list));
	}

}
