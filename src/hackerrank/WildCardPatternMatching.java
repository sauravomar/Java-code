package com.ril.slot;

public class WildCardPatternMatching {

	boolean isMatch(String pattern, String str) {

		boolean patt[][] = new boolean[str.length() + 1][pattern.length() + 1];

		patt[0][0] = true;

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < pattern.length(); j++) {
				if (str.charAt(i) == pattern.charAt(j) && patt[i][j]) {
					patt[i + 1][j + 1] = true;
				} else if (pattern.charAt(j) == '?' && patt[i][j]) {
					patt[i + 1][j + 1] = true;
				} else if (pattern.charAt(j) == '*' && (patt[i][j+1] || patt[i+1][j])) {
					patt[i + 1][j + 1] = true;
				}
			}
		}

		return patt[str.length()][pattern.length()];
	}

	public static void main(String[] args) {
		System.out.println(new WildCardPatternMatching().isMatch("x?y*z", "xazlmz"));
	}

}
