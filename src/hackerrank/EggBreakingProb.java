package com.ril.slot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EggBreakingProb {

//	public int getMaxSteps(int egg, int floor) {
//
//		if (egg == 1)
//			return floor;
//		if (floor == 0 || floor == 1)
//			return floor;
//
//		int min = Integer.MAX_VALUE;
//		int resp = 0;
//
//		for (int i = 1; i <= floor; i++) {
//			resp = Math.max(getMaxSteps(egg - 1, floor - 1), getMaxSteps(egg, floor - i));
//
//			if (resp < min)
//				min = resp;
//		}
//
//		return min + 1;
//	}
//
//	public static void main(String[] args) {
//		int val1 = 10;
//		int val2 = val1++;
//		System.out.println(val2);
//	}
//
//	public int DP(int egg, int floor) {
//
//		int arr[][] = new int[egg + 1][floor + 1];
//
//		for (int i = 1; i <= floor; i++) {
//			arr[1][i] = i;
//		}
//
//		for (int i = 1; i <= egg; i++) {
//			arr[i][1] = 1;
//		}
//
//		int min = Integer.MAX_VALUE;
//		int resp = 0;
//
//		for (int i = 2; i <= egg; i++) {
//			for (int j = 2; j <= floor; j++) {
//				for (int k = 1; k <= j; k++) {
//					resp = Math.max(arr[i - 1][j - 1], arr[i][j - k]) + 1;
//					if (resp < min)
//						min = resp;
//				}
//				arr[i][j] = min;
//				min = Integer.MAX_VALUE;
//				Math.abs
//			}
//
//		}
//
//		return arr[egg][floor];
//	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		
		String S = br.readLine();
		String T = br.readLine();
		int K = Integer.parseInt(br.readLine().trim());
		String out_ = solve(S, T, K);
		System.out.println(out_);
		wr.close();
		br.close();
	}

	static String solve(String S, String T, int K) {

		if (S.length() != T.length())
			return "No";

		for (int i = 0; i < S.length(); i++) {
			System.out.println(T.charAt(i) + " " +S.charAt(i));
			System.out.println(T.charAt(i) - S.charAt(i));
			if (Math.abs(S.charAt(i) - T.charAt(i)) != K) {
				return "No";
			}
			K--;
		}
		return "Yes";
	}

}
