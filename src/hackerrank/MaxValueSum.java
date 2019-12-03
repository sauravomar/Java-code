package com.ril.grocery.slotManagement.redis.publisher;

public class MaxValueSum {

	public int getRotatedMaxSum(int arr[]) {

		int sum = 0;
		int currValSum = 0;	
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			currValSum =  currValSum + i * arr[i];
		}

		int maxSum = currValSum;

		for (int i = 1; i < arr.length; i++) {
			currValSum = currValSum   + sum  - arr.length * arr[arr.length - i];
			
			if(maxSum < currValSum) maxSum = currValSum;
		}

		return maxSum;

	}
	public static void main(String[] args) {
	    int arr[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9}; 
	    System.out.println(new MaxValueSum().getRotatedMaxSum(arr));
	}

}
