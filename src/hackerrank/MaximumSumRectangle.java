package com.ril.slot;

public class MaximumSumRectangle {

	public void maxSum(int arr[][]) {

		int maxLeft = 0;
		int maxRight = 0;
		int maxUp = 0;
		int maxDown = 0;
		int maxSum = 0;

		for (int i = 0; i < arr[0].length; i++) {
			
			int maxArray[] = new int[arr.length];
			
			for (int j = i; j < arr[0].length; j++) {

				for (int k = 0; k < arr.length; k++) {
					maxArray[k] +=arr[k][j];
				}

				int currSum = 0;
				int localSum = 0;
				int start = -1;
				int end = -1;
				int localStart = -1;

				for (int k = 0; k < maxArray.length; k++) {
					currSum = currSum + maxArray[k];
					
					if (currSum < 0) {
						localStart = k + 1;
						currSum = 0;
					}

					else if (currSum > localSum) {
						localSum = currSum;
						start = localStart;
						end = k;
					}

				}

				if (maxSum < localSum) {
					maxSum = localSum;
					maxLeft = i;
					maxRight = j;
					maxUp = start;
					maxDown = end;

				}
			}
		}

		System.out.println(" max left = " + maxLeft + " max right = " + maxRight + " max up = " + maxUp + " max down = "
				+ maxDown + " maxSum " + maxSum);
	}

	public static void main(String[] args) {
		new MaximumSumRectangle().maxSum(
				new int[][] { { 1, 2, -1, -4, -20 }, { -8, -3, 4, 2, 1 }, { 3, 8, 10, 1, 3 }, { -4, -1, 1, 7, -6 } });
	}

}
