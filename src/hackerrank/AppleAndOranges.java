package com.ril.slot;

public class AppleAndOranges {

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		int appleCount = 0;
		int orangeCount = 0;

		for (int i = 0; i < apples.length; i++) {
			if ((apples[i] + a) >= s && (apples[i] + a) <= t) {
				appleCount++;
			}
		}

		for (int i = 0; i < oranges.length; i++) {
			if ((oranges[i] + b) >= s && ((oranges[i] + b)) <= t) {
				orangeCount++;
			}
		}

		System.out.println(appleCount);
		System.out.println(orangeCount);

	}

	public static void main(String[] args) {
		int apples[] = new int[] { 2, 3, -4 };
		int oranges[] = new int[] { 3, -2, -4 };

		countApplesAndOranges(7, 10, 4, 12, apples, oranges);
	}
}
