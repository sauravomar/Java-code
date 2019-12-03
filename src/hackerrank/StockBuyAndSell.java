package com.ril.grocery.slotManagement.redis.publisher;

import java.util.Scanner;

public class StockBuyAndSell {

	public static void buyAndCell(int arr[]) {

		if (arr.length == 1)
			return;

		int iterator = 0;
		int start = 0;
		int end = 0;
		boolean isProfit = false;
		while (iterator < arr.length) {
			while (iterator < (arr.length - 1) && arr[iterator] >= arr[iterator + 1]) {
				iterator++;
			}

			if (iterator == arr.length - 1)
				break;
			start = iterator;

			while (iterator < (arr.length - 1) && arr[iterator] <= arr[iterator + 1]) {
				iterator++;
			}
			end = iterator;
			if(start > end ) {
				isProfit = true;
				System.out.print("(" + start + " "  + end + ")");
			}
		}
		
		if(!isProfit) System.out.println("No Profit");
		

	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int testCase = scanner.nextInt();
		for (int i = 0; i < testCase; i++) {
			int arraySize = scanner.nextInt();
			int arr[] = new int[arraySize];

			for (int j = 0; j < arraySize; j++) {
				arr[i] = scanner.nextInt();
			}
			StockBuyAndSell.buyAndCell(arr);
		}

	}
}
