package com.ril.slot;

public class PallindromePartition {

	boolean ispallindrome(String input, int start, int end) {

		if (start == end)
			return true;

		if (end >= input.length())
			return false;
		System.out.println(input.substring(start, end));
		while (start < end) {
			if (input.charAt(start) != input.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}

	public int totalPart(String str) {
		int arr[][] = new int[str.length()][str.length()];

		for (int L = 2; L <= str.length(); L++) {
			for (int i = 0; i < str.length() - L + 1; i++) {

				int j = i + L - 1;

				if (ispallindrome(str, i, j)) {
					arr[j][j] = 0;
				} else {
					arr[i][j] = str.length();
					for (int k = i; k <= j - 1; k++)
						arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k + 1][j] + 1);

				}
			}
		}

		return arr[0][str.length()-1];
	}

	public static void main(String[] args) {
		System.out.println(new PallindromePartition().totalPart("ababbbabbababa"));
	}

}
