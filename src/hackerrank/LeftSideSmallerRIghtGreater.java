package com.ril.grocery.slotManagement.redis.publisher;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeftSideSmallerRIghtGreater {

	public static void main(String[] args) throws Exception {

		// Using BufferedReader class to take input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// taking input of number of testcase
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			// n : size of array
			int n = Integer.parseInt(br.readLine());

			// Declaring array
			int arr[] = new int[n];

			// to read multiple integers line
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");

			// array elements input
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(strs[i]);

			// Calling Functions to segregate Array elements
			LeftSideSmallerRIghtGreater.find(arr);

		}
		br.close();

	}

	static void find(int arr[]) {

		int left[] = new int[arr.length];

		int element = 0;
		boolean isFound = false;
		int rightMin = Integer.MAX_VALUE;

		left[0] = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i - 1]);
		}

		for (int i = arr.length - 1; i > 0; i--) {
			
			if (i < arr.length-1 && arr[i] >= left[i] && arr[i] <= rightMin) {
				element = arr[i];
				isFound = true;
			}else if(arr[i] > left[i] && arr[i] < rightMin){
				element = arr[i];
				isFound = true;
			}

			rightMin = Math.min(rightMin, arr[i]);
		}

		if (isFound)
			System.out.println(element);
		else
			System.out.println(-1);
	}

}
