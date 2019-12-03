package com.ril.slot;

public class AlmostSorted {
	// Complete the almostSorted function below.
	static void almostSorted(int[] arr) {

		if(arr.length == 2) {
			if(arr[0] > arr[1]) {
				System.out.println("yes");
				System.out.println("swap 1 2");
				return;
			}
		}
		
		int bitonicCount = 0;
		int start = -1;
		int end = -1;
		boolean isSwap = false;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				bitonicCount++;
				start = i;
				while (i < arr.length - 1) {
					if (arr[i] < arr[i + 1])
						break;
					i++;
				}
				end = i;
			}
			
			if((end - start) == 1 && arr[end] < arr[start]) {
				System.out.println("no");
				return;
			}
		
			
			if (start !=-1 && arr[end] < arr[start] && arr[end] > arr[start + 1]) {
				isSwap = true;
			}
		}

		if (bitonicCount > 1)
			System.out.println("no");

		if (bitonicCount == 1) {
			System.out.println("yes");
			if (start != -1 && end != -1) {
				if (!isSwap)
					System.out.print("reverse ");
				System.out.println((start + 1) + " " + (end + 1));
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1 ,5 ,4 ,3 ,2, 6};
		AlmostSorted.almostSorted(arr);

	}
}
