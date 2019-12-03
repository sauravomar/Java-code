package com.ril.grocery.slotManagement.redis.publisher;

public class LongestPrefixAndSuffix {

	public int computeLPSArray(String pat) {

		int maxLenth = 0;
		
		int len = 0;
		int i = 1;
		int lps[] = new int[pat.length()];
		lps[0] = 0;

		while (pat.length() > i) {

			if (pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
				if(maxLenth < len) maxLenth = len;
			} else {
				if (len != 0) {
					len = lps[len - 1];
				} else {
					lps[i] = len;
					i++;
				}
			}
		}
		return maxLenth;
	}
	
	
}
