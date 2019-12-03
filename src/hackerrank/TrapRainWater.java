package com.ril.slot;

public class TrapRainWater {

	public int getTrapWater(int arr[]) {
		
		int lowMax = 0;
		int rightMax = 0;
		int lo = 0;
		int hi = arr.length -1;
		int result = 0;

		while(lo < hi) {
			if(arr[lo] < arr[hi]) {
				
				if(lowMax < arr[lo]) {
					lowMax = arr[lo];
				}else {
						result =  result + lowMax - arr[lo];
				}
				lo++;
			}else {
				if(rightMax < arr[hi]) {
					rightMax = arr[hi];
				}else {
						result =  result + rightMax - arr[hi];
				}
				hi--;
			}
			
		}
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.println(new TrapRainWater().getTrapWater(arr));
	}
	
}
