package com.ril.slot;

public class JumpingOntheClouds {

	static int jumpingOnClouds(int[] c) {
		int count = 0;
		int index = 0;
		while (index + 2 < c.length) {
			if (c[index + 1] == 1 && c[index + 2] == 1) {
				return -1;
			}

			if (c[index + 2] == 0) {
				index = index + 2;
			} else {
				index = index + 1;
			}
			count = count + 1;
		}
		
		if(index < c.length-1) {
			count = count + 1;
		}
		return count;
	}

	public static void main(String[] args) {
		int c[] = new int[] { 0, 0, 0,0, 1, 0 };
		System.out.println(jumpingOnClouds(c));
	}
}
