package com.ril.slot;

import java.util.Arrays;

public class BreakingRecords {

	static int[] breakingRecords(int[] scores) {

		int min = scores[0];
		int max = scores[0];

		int minCount = 0;
		int maxCount = 0;

		int[] result = new int[2];

		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > max) {
				maxCount++;
				max = scores[i];
			}

			if (scores[i] < min) {
				minCount++;
				min = scores[i];
			}
		}
		result[0] = maxCount;
		result[1] = minCount;

		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(breakingRecords(new int[] {10, 5, 20, 20, 4, 5, 2, 25, 1})));
	}

}
