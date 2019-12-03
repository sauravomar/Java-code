package com.ril.grocery.slotManagement.redis.publisher;

public class ArrayRotation {

	public int gcd(int n, int d) {

		if (d == 0)
			return n;

		else
			return gcd(d, n % d);

	}

	public void leftRotate(int arr[], int d) {

		int gcd = gcd(arr.length, d);
		int start = 0;
		
		for (int i = 0; i < d; i++) {
			
			if(gcd != 1) start = i;
			int temp = arr[start];
			for (int j = start; j < arr.length-d; j = j + d) {
				arr[j] = arr[j + d];
			}

			arr[arr.length - d + -1] = temp;
		}
	}

	public void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		
		ArrayRotation obj = new ArrayRotation();
		obj.leftRotate(arr, 1);
		obj.printArray(arr);

	}

}
