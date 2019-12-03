package com.ril.slot;

import java.util.Arrays;

public class CompletingNTrips {

	public int minimumTime(int arr[], int N) {
		
		Arrays.sort(arr);
		int trips = 0;

		for (int i = 0; i < arr.length; i++) {
			trips = trips + arr[i];
			if (trips >= N)
				return i;
		}

		return -1;

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 5, 8, 3, 1 };
		System.out.println(new CompletingNTrips().minimumTime(arr, 5));
	}

}
