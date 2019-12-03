package com.ril.grocery.slotManagement.redis.publisher;

import java.util.Scanner;

public class MaximumSquareSubArray {

	public static int maxArray(int arr[][]) {

		int aux[][] = new int[arr.length][arr[0].length];

		for (int i = 0; i < arr.length; i++) {
			aux[i][0] = arr[i][0];
		}

		for (int i = 0; i < arr[0].length; i++) {
			aux[0][i] = arr[0][i];
		}

		int max = 0;

		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {

				if (arr[i][j] == 1) {
					aux[i][j] = Math.min(aux[i - 1][j - 1], Math.min(aux[i - 1][j], aux[i][j - 1])) + 1;

				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {

				if (aux[i][j] > max) {
					max = aux[i][j];
				}

			}
		}
		return max;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		for (int i = 0; i < testCase; i++) {
			int row = scanner.nextInt();
			int col = scanner.nextInt();

			int arr[][] = new int[row][col];

			for (int k = 0; k < arr.length; k++) {
				for (int j = 0; j < arr[0].length; j++) {

					arr[k][j] = scanner.nextInt();

				}
			}
			System.out.println(MaximumSquareSubArray.maxArray(arr));
		}

	}
}
