package com.ril.slot;

public class KMP {

	public int[] getPrefixTable(String pattern) {

		int arr[] = new int[pattern.length()];

		int iterator = 1;
		int index = 0;

		while (iterator < pattern.length()) {
			if (pattern.charAt(index) == pattern.charAt(iterator)) {
				index++;
				arr[iterator] = index;
				iterator++;
			} else {

				if (index != 0) {
					index = arr[index - 1];
				} else {
					arr[iterator] = 0;
					iterator++;
				}
			}
		}

		return arr;
	}

	public boolean match(String str, String pattern) {

		int table[] = getPrefixTable(pattern);
		int patternIndex = 0;
		int strIndex = 0;

		boolean isPresent = false;

		while (strIndex < str.length()) {

			if (str.charAt(strIndex) == pattern.charAt(patternIndex)) {
				strIndex++;
				patternIndex++;
			}
			if (patternIndex == pattern.length()) {
				System.out.println(" Found ");
				isPresent = true;
			} else if( strIndex < str.length() && str.charAt(strIndex) != pattern.charAt(patternIndex)){
				if(patternIndex !=0) patternIndex = table[patternIndex - 1];
				else strIndex++;
			}

		}

		return isPresent;
	}

	public static void main(String[] args) {
		KMP kmp = new KMP();
		
		String pattern = "ABABCABAB";
		String str = "ABABDABACDABABCABAB";
		
		
		System.out.println(kmp.match(str, pattern));
		
	}

}
