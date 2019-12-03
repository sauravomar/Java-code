package com.ril.slot;

public class ManacherAlgorithm {

	public static int  pallindrome(String str) {
		
		int length = 2 * str.length() + 3; 
		int [] p = new int[length];
		int C =0, R =0;
		int max = 0;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("$");
		sb.append('#');
		for(int i =0 ;i <str.length(); i++) {
			sb.append(str.charAt(i));
			sb.append('#');
		}
		
		sb.append("@");
		str = sb.toString();
		
		for( int i =1; i <length-1; i++) {
			int mirror = 2*C  -i;
			if(i < R) {
				p[i] = Math.min(R-i, p[mirror]);
			}
			while(i -( 1+  p[i]) > 0 && i +( 1+  p[i]) < length &&  str.charAt(i +( 1+  p[i])) == str.charAt(i -( 1+  p[i]))) {
				p[i]++;
			}
			if(i + p[i] > R) {
				C = i;
				R = i + p[i];
			}
			
			if(max < p[i]) max = p[i];
			
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		System.out.println(ManacherAlgorithm.pallindrome("ABABABA"));
	}
}
