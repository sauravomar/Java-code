package com.ril.slot;

public class PascalWater {

	
	public float findWater(int row, int col, int water) {

		int contains = (int) (Math.pow(2, row-1) -1);
		
		
		
		int diff =  water - contains;
		
		if(diff > 0) {
			float level = (float) (Math.pow(2, row-1));
			return diff/level;
		}else return 0.0f;
	}
	
	public static void main(String[] args) {
		PascalWater water =  new PascalWater();
		System.out.println(water.findWater(4, 2, 11));
	}
}
