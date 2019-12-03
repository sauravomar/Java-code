package com.ril.slot;

public class WordLadder {

	String[] dictionary;

	private boolean isValidConvert(String src, String dest) {

		if (src.length() != dest.length())
			return false;

		int count = 0;
		for (int i = 0; i < src.length(); i++) {
			if (src.charAt(i) != dest.charAt(i))
				count++;
		}
		return count == 1;
	}

	public int getMinConversion(String src, String dest, int index[]) {

		if (src.equals(dest))
			return 0;

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < dictionary.length; i++) {
			if (isValidConvert(src, dictionary[i]) && index[i] == 0) {
				index[i] =  1;
				int result = getMinConversion(dictionary[i], dest, index) + 1;
				if (min > result)
					min = result;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		WordLadder ladder = new WordLadder();
		String[] dictionary = { "POON", "PLEE", "SAME", "POIE", "PLEA", "PLIE", "POIN" };
		ladder.dictionary = dictionary;
		int index [] = new int[dictionary.length];
		System.out.println(ladder.getMinConversion("TOON", "PLEA", index));

	}

}
