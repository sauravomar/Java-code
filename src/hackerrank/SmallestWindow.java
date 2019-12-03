package com.ril.slot;

import java.util.HashMap;

public class SmallestWindow {

	@SuppressWarnings("unlikely-arg-type")
	public static void window(String str, String pattern) {

		StringBuilder sb = new StringBuilder();

		int patternCount = 0;
		int start = -1;
		int startIndex = -1;
		int minLength = Integer.MAX_VALUE;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		HashMap<Character, Integer> strMap = new HashMap<Character, Integer>();

		for (char ch : pattern.toCharArray()) {
			int count = 0;
			if (map.containsKey(ch)) {
				count = map.get(ch);
			}
			map.put(ch, count + 1);
		}

		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			if (strMap.containsKey(str.charAt(i))) {
				count = strMap.get(str.charAt(i));
			}
			strMap.put(str.charAt(i), count + 1);

			if (map.containsKey(str.charAt(i)) && strMap.containsKey(str.charAt(i)) && strMap.get(str.charAt(i)) <= map.get(str.charAt(i))) {
				if(start == -1)start = i;
				patternCount++;
			}

			if (patternCount == pattern.length()) {
				while ((strMap.containsKey(str.charAt(start)) && map.containsKey(str.charAt(start))
						&& strMap.get(str.charAt(start)) > map.get(str.charAt(start))) 
						|| !map.containsKey(str.charAt(start))) {
					
					System.out.println(str.charAt(start));
					
					if (strMap.containsKey(str.charAt(start)) && map.containsKey(str.charAt(start))
							&& strMap.get(str.charAt(start)) > map.get(str.charAt(start))){
						strMap.put(str.charAt(start), strMap.get(str.charAt(start)) - 1);
					}
					
					start++;
				}

				int length = i - start + 1;
				
				if (length < minLength) {
					minLength = length;
					startIndex = start;
				}
			}

		}

		if (startIndex == -1)
			System.out.println(" Not Found");
		System.out.println(minLength + " " + startIndex);
//		else System.out.println(str.substring(startIndex-1, minLength));

	}
	
	// Function to find smallest window containing 
    // all characters of 'pat' 
    static String findSubString(String str, String pat) 
    { 
        int len1 = str.length(); 
        int len2 = pat.length(); 
      
        // check if string's length is less than pattern's 
        // length. If yes then no such window can exist 
        if (len1 < len2) 
        { 
            System.out.println("No such window exists"); 
            return ""; 
        } 
      
        int hash_pat[] = new int[256]; 
        int hash_str[] = new int[256]; 
      
        // store occurrence ofs characters of pattern 
        for (int i = 0; i < len2; i++) 
            hash_pat[pat.charAt(i)]++; 
      
        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE; 
      
        // start traversing the string 
        int count = 0; // count of characters 
        for (int j = 0; j < len1 ; j++) 
        { 
            // count occurrence of characters of string 
            hash_str[str.charAt(j)]++; 
      
            // If string's char matches with pattern's char 
            // then increment count 
            if (hash_pat[str.charAt(j)] != 0 && 
                hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)] ) 
                count++; 
      
            // if all the characters are matched 
            if (count == len2) 
            { 
                // Try to minimize the window i.e., check if 
                // any character is occurring more no. of times 
                // than its occurrence in pattern, if yes 
                // then remove it from starting and also remove 
                // the useless characters. 
                while ( hash_str[str.charAt(start)] > hash_pat[str.charAt(start)] 
                    || hash_pat[str.charAt(start)] == 0) 
                { 
      
                    if (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)]) 
                        hash_str[str.charAt(start)]--; 
                    start++; 
                } 
      
                // update window size 
                int len_window = j - start + 1; 
                if (min_len > len_window) 
                { 
                    min_len = len_window; 
                    start_index = start; 
                } 
            } 
        } 
      
        // If no window found 
        if (start_index == -1) 
        { 
        System.out.println("No such window exists"); 
        return ""; 
        } 
      
        // Return substring starting from start_index 
        // and length min_len 
        return str.substring(start_index, start_index + min_len); 
    } 

	public static void main(String[] args) {
		String str = "this is a test string";
		String pat = "tist";

		SmallestWindow.window(str, pat);
	}

}
