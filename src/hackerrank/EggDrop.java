package com.ril.slot;

public class EggDrop {

	int arr[][];

	public int getMinEgg(int floor, int egg) {

		arr = new int[floor+1][egg+1];
		return calculate(floor, egg);
	}

	public int calculate(int floor, int egg) {
		
		if (floor == 0 || floor == 1) {
			return floor;
		}
		if (egg == 1) {	
			return floor;
		}
		if (floor >= 0 && egg >= 0 && arr[floor][egg] != 0)
			return arr[floor][egg];

		int min = Integer.MAX_VALUE;;

		for (int i = 1; i <= floor; i++) {
			int max1 = calculate(i - 1, egg - 1);
			int max2 = calculate(floor - i, egg);
			int res = Math.max(max1, max2);
			if (res < min)
				min = res;
		}

		arr[floor][egg] = min + 1;

		return arr[floor][egg];
	}

	public static void main(String[] args) {
		EggDrop obj = new EggDrop();
		System.out.println(obj.getMinEgg(10, 2));
		

	}

}
