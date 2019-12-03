package com.ril.grocery.slotManagement.redis.publisher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MInimumStrAtoB {

	private boolean isSameCount(String A, String B) {

		Map<Character, Integer> map = new HashMap<>();

		if (A.length() != B.length())
			return false;

		for (int i = 0; i < A.length(); i++) {
			int count = map.containsKey(A.charAt(i)) ? map.get(A.charAt(i)) : 0;
			map.put(A.charAt(i), count+1);
		}

		for (int i = 0; i < B.length(); i++) {
			if (map.containsKey(B.charAt(i))) {
				map.put(B.charAt(i), map.get(B.charAt(i)) - 1);
				if(map.get(B.charAt(i)) == 0)  map.remove(B.charAt(i));
			} else {
				return false;
			}
		}
		return true;
	}

	public int getMin(String a, String b) {

		if (!isSameCount(a, b))
			return -1;

		int i = a.length() - 1;
		int j = a.length() - 1;
		int res = 0;

		while (i >= 0) {

			if (a.charAt(i) != b.charAt(j)) {
				res++;
			} else {
				j--;
			}
			i--;

		}

		return res;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Printing the read line
		int t = Integer.parseInt(reader.readLine());

		MInimumStrAtoB obj = new MInimumStrAtoB();

		while (t-- > 0) {
			String input = reader.readLine();
			String a[] = input.split("\\s+");
			System.out.println(obj.getMin(a[0], a[1]));

		}

	}

}
