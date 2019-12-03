package com.ril.slot;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {
		int dist = x1 - x2;
		int speed = v1 - v2;
		
		if(speed == 0 && dist == 0) return "YES";
		
		if(speed == 0 && dist !=0) return "NO";

		if (dist > 0 && speed > 0 || dist < 0 && speed < 0)
			return "NO";

		if(speed == 0)
		
		if (Math.abs(dist) % Math.abs(speed) == 0)
			return "YES";

		return "NO";
	}

	public static void main(String[] args) {
		System.out.println(kangaroo(43, 2, 70, 2));
	}
}
