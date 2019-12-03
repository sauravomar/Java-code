package com.ril.grocery.slotManagement.redis.publisher;

public class FindMisingElement {

	static int getSingle(int arr[]) {
		int ones = 0, twos = 0;
		int common_bit_mask;

		for (int i = 0; i < arr.length; i++) {
			twos = twos | (ones & arr[i]);
			ones = ones ^ arr[i];
			common_bit_mask = ~(ones & twos);
			ones &= common_bit_mask;
			twos &= common_bit_mask;
		}
		return ones;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 3, 2, 3 };
		System.out.println("The element with single occurrence is " + 
		FindMisingElement.getSingle(arr));
	}

}
