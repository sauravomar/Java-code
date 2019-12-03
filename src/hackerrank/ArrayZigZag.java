package com.ril.slot;

import java.util.Arrays;

public class ArrayZigZag {

	private void swap(int arr[], int pos1, int pos2) {
		
		arr[pos1] = arr[pos2]^arr[pos1];
		arr[pos2] = arr[pos2]^arr[pos1];
		arr[pos1] = arr[pos2]^arr[pos1];
		
		
	}
	
	public int[] zigzag(int arr[]) {
		
		boolean isAlternate= true;
		
		for(int i=0; i< arr.length-1; i++) {
			if(isAlternate && arr[i] > arr[i+1]) {
				swap(arr, i, i+1);
			}else if(!isAlternate && arr[i] < arr[i+1]) {
				swap(arr, i, i+1);
			}
			isAlternate = !isAlternate;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = {4, 3, 7, 8, 6, 2, 1};
		System.out.println(new ArrayZigZag().zigzag(arr));
		Arrays.stream(arr).forEach(System.out::println);
	}
}
