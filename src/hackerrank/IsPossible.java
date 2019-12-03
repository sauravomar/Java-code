package com.ril.slot;

public class IsPossible {

	private String isPossible(int a, int b, int c, int d) {
		
		if (a == c && b == d) return "Yes";
		if(a > c || b > d) return "No";
		
		String res1 =  isPossible(a+b, b, c, d);
		
		if(res1.equals("Yes")) return "Yes";
		
		String res2 = isPossible(a, b+a, c, d);
		
		if(res1.equals("Yes") || res2.equals("Yes")) return "Yes";
		else return "No";
	}
	
	public static void main(String[] args) {
		System.out.println(new IsPossible().isPossible(1, 2, 3, 6));
	}
	
}
