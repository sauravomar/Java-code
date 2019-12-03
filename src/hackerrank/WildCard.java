package com.ril.slot;

public class WildCard {

	public static boolean isValid(String str, String pattern) {

		pattern = compressed(pattern);
		boolean arr[][] = new boolean[str.length() + 1][pattern.length() + 1];

		arr[0][0] = true;

		for (int j = 1; j <= pattern.length(); j++)
			if (pattern.charAt(j - 1) == '*')
				arr[0][j] = arr[0][j - 1];

		for (int i = 1; i <= str.length(); i++) {

			for (int j = 1; j <= pattern.length(); j++) {
				if (str.charAt(i - 1) == pattern.charAt(j - 1) || pattern.charAt(j - 1) == '?') {
					arr[i][j] = arr[i - 1][j - 1];
				} else if (pattern.charAt(j - 1) == '*') {
					arr[i][j] = arr[i][j - 1] || arr[i - 1][j];
				}
			}
		}

		return arr[str.length()][pattern.length()];

	}

	public static String compressed(String pattern) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < pattern.length(); i++) {

			if (i > 0 && pattern.charAt(i) == '*' && sb.charAt(sb.length() - 1) == '*') {
				continue;
			}
			sb.append(pattern.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String args[]) {
		String str = "baaabab";
//		String pattern = "*****ba*****ab";
		 String pattern = "ba*****ab";
		// String pattern = "ba*ab";
		// String pattern = "a*ab";
		// String pattern = "a*****ab";
		// String pattern = "*a*****ab";
		// String pattern = "ba*ab****";
		// String pattern = "****";
		// String pattern = "*";
		// String pattern = "aa?ab";
		// String pattern = "b*b";
		// String pattern = "a*a";
		// String pattern = "baaabab";
		// String pattern = "?baaabab";
		// String pattern = "*baaaba*";

		if (isValid(str, pattern))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
