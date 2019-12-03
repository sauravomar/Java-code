package com.ril.slot;

import java.util.HashMap;
import java.util.Map;

public class Longestsubstr {

	public int lengthOfLongestSubstring(String s) {

		if (s.length() == 0)
			return 0;

		int length = 0;
		int maxLength = 1;

		Map<Character, Integer> map = new HashMap<>();

		s = s.trim();

		if (s.length() == 0)
			return 1;

		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				length++;
			} else {
				if (length > maxLength)
					maxLength = length;

				i = map.get(s.charAt(i))+1;
				map = new HashMap<>();
				length = 1;

			}

			map.put(s.charAt(i), i);
		}

		if (length > maxLength)
			maxLength = length;

		return maxLength;
	}

	public static void main(String[] args) {
		System.out.println(new Longestsubstr().lengthOfLongestSubstring("dvdf"));
	}
}
