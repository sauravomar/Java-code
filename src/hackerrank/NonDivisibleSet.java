package com.ril.slot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonDivisibleSet {

	public static int nonDivisibleSubset(int k, List<Integer> s) {

		int arr[] = new int[k];

		for (int i = 0; i < s.size(); i++) {
			arr[s.get(i) % k]++;
		}

		int result = arr[0] > 0 ? 1 : 0;

		for (int i = 1; i <= (k / 2); i++) {
			if (i != k - i)
				result += Math.max(arr[i], arr[k - i]);
			else
				result++;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(equalizeArray(new int[] { 37,32,97,35,76,62 }));
	}

	static int equalizeArray(int[] arr) {

		Arrays.sort(arr);

		int maxCount = 0;

		int index = 1;
		while (index < arr.length) {
			if (arr[index] == arr[index - 1]) {
				int count = 1;
				while (index < arr.length && arr[index] == arr[index - 1]) {
					count++;
					index++;
				}

				if (maxCount < count)
					maxCount = count;
			}
			
			index++;
		}
		
		if(maxCount == 0) return arr.length-1;
		return arr.length - maxCount;

	}

	static long repeatedString(String s, long n) {

		long countA = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a')
				countA++;
		}

		long result = (n / s.length()) * countA;

		for (int i = 0; i < n % s.length(); i++) {
			if (s.charAt(i) == 'a')
				result++;
		}

		return result;

	}

}
