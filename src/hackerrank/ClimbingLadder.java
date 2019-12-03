package com.ril.slot;

import static java.util.Arrays.binarySearch;
import static java.util.stream.IntStream.range;

import java.util.Arrays;

public class ClimbingLadder {

	static int[] climbingLeaderboard(int[] scores, int[] alice) {

		int result[] = new int[alice.length];
		int[] array = range(0, scores.length).map(i -> scores[scores.length - i - 1]).distinct().toArray();
		int index = 0;
		int count = 0;
		for (int score : alice) {
			index = binarySearch(array, index < 0 ? 0 : index, array.length, score);
			if (index < 0)
				index = -index - 2;
			result[count++] = array.length - index;
		}
		return result;
	}

	// Complete the hurdleRace function below.
	static int hurdleRace(int k, int[] height) {

		int max = 0;
		for (int score : height) {
			if (max < score)
				max = score;
		}

		if (k > max)
			return 0;
		else
			return max - k;

	}

	// Complete the designerPdfViewer function below.
	static int designerPdfViewer(int[] h, String word) {
		int length = word.length();
		
		int max = 1;
		for(char height :  word.toLowerCase().toCharArray()) {
			if(h[height -'a' ] > max) {
				max = h[height -'a' ];
			}
		}
		
		return length * max;
	}

//	private static int[] updateRank(Map<Integer, Integer> map, int[] scores, int no) {
//
//		int index = binarySearch(scores, 0, scores.length - 1, no);
//		int[] copy = new int[scores.length + 1];
//		int startLoop = 1;
//
//		if (index == 0) {
//			map.put(no, 1);
//		} else {
//			map.put(no, map.get(scores[index]) + 1);
//			System.arraycopy(scores, 0, copy, 0, index + 1);
//			copy[index + 1] = no;
//			startLoop = index+2;
//		}
//		
//		for (int i = startLoop; i < copy.length; i++) {
//			copy[i] = scores[i - 1];
//			map.put(copy[i], map.get(copy[i]) + 1);
//		}
//
//		return copy;
//	}

//	private static int binarySearch(int scores[], int start, int end, int no) {
//
//		int mid = (end - start) / 2;
//
//		mid = mid + start;
//
//		if (mid == start && start == end)
//			return start;
//
//		if (scores[mid] == no || (mid == start && scores[mid + 1] < no && scores[mid] > no)
//				|| scores[mid] > no && scores[mid + 1] < no) {
//			return mid;
//		}
//
//		if (mid == end && scores[mid - 1] > no && scores[mid] < no || scores[mid - 1] > no && scores[mid] < no)
//			return mid - 1;
//
//		if (no < scores[mid]) {
//			return binarySearch(scores, mid + 1, end, no);
//		} else {
//			return binarySearch(scores, start, mid - 1, no);
//		}
//	}

	public static void main(String[] args) {
		int scores[] = new int[] { 100, 90, 90, 80, 75, 60 };
		int alice[] = new int[] { 50, 65, 77, 90, 102 };

		System.out.println(Arrays.toString(climbingLeaderboard(scores, alice)));

	}

}
