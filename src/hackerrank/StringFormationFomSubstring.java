package com.ril.grocery.slotManagement.redis.publisher;

public class StringFormationFomSubstring {

	public String computeLPSArray(String pat) {

		int len = 0;
		int i = 1;
		int lps[] = new int[pat.length()];
		lps[0] = 0;

		while (pat.length() > i) {

			if (pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len != 0) {
					len = lps[len - 1];
				} else {
					lps[i] = len;
					i++;
				}
			}
		}

	    return (len > 0 && pat.length()%(pat.length()-len) == 0)? "True": "False"; 

	}

	public static void main(String[] args) {
		System.out.println(new StringFormationFomSubstring().computeLPSArray("lh"));
	}
}
