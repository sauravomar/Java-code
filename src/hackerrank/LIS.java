package com.ril.grocery.slotManagement.redis.publisher;

import java.util.Scanner;

public class LIS {

	public static int lis(int arr[]) {

		int lis[] = new int[arr.length];
		int max = 0;

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;
					if (max < lis[i])
						max = lis[i];
				}

			}
		}
		return max + 1;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		for (int i = 0; i < testCase; i++) {
			int arraySize = scanner.nextInt();
			int arr[] = new int[arraySize];

			for (int j = 0; j < arraySize; j++) {
				arr[j] = scanner.nextInt();
			}
			System.out.println(LIS.lis(arr));
		}
	}
}
