package com.ril.grocery.slotManagement.redis.publisher;

import java.util.Arrays;

public class PythagoreanTriplet {

	static String getTriplet(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			int left = 0;
			int right = arr.length - 1;

			while (left < right) {
				if (arr[left] + arr[right] == arr[i])
					return "Yes";
				else if (arr[left] + arr[right] < arr[i]) {
					left++;
				} else {
					right--;
				}
			}
		}
		return "No";
	}

	public static void main(String[] args) {
		int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 
                30, 40, 28, 42, 30, 44, 48, 
                43, 50}; 
		System.out.println(PythagoreanTriplet.distributeChocklates(arr, 7));
	}
	
	static int distributeChocklates(int arr[], int m) {

		if(arr.length < m) return -1;
		
		Arrays.sort(arr);

		int first = 0;
		int last = 0;
		int minDiff = arr[arr.length -1];
		for (int i = 0; i < (arr.length - m+1) ; i++) {
			if((arr[i+m-1] - arr [i]) < minDiff ) {
				minDiff = arr[i+m-1] - arr [i] ;
				first = i;
				last = i+m-1;
			}
			
		}
		
		return arr[last] - arr[first];
		
	}
}
