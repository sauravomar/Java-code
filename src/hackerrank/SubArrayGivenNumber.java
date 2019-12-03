package com.ril.slot;

public class SubArrayGivenNumber {

	
	private static void subArray(int arr[], int sum) {
		
		int currSum = 0;
		
		int currIterator = 0;
		
		for(int i=0;i < arr.length;  i++) {
			
			currSum = currSum  + arr[i];
			
			if(currSum == sum) System.out.println(currIterator + " " + i); 
			
			while(currSum > sum && currIterator < i && currIterator < arr.length) {
				currSum = currSum  -  arr[currIterator];
				currIterator = currIterator+1;
				
				if(currSum == sum) System.out.println(currIterator + " " + i); 
			}
			
			
			
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {15, -2, 2, -8, 1, 7, 10, 23}; ;
		SubArrayGivenNumber.subArray(arr, 0);
	}
}
