package com.ril.slot;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class COmbinationOfAllStrings {

	public void print(String pre, String str, int start) {

		if (pre.length() == str.length())
			return;

		for (int i = start; i < str.length(); i++) {
			System.out.println(pre + str.charAt(i));
			print(pre + str.charAt(i), str, i + 1);
		}

	}

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		List<Integer> result = new ArrayList<Integer>();

		int pointsAlice = ((a.get(0) > b.get(0)) ? 1 : 0) + ((a.get(1) > b.get(1)) ? 1 : 0)
				+ ((a.get(2) > b.get(2)) ? 1 : 0);
		int pointsBob = ((a.get(0) < b.get(0)) ? 1 : 0) + ((a.get(1) < b.get(1)) ? 1 : 0)
				+ ((a.get(2) < b.get(2)) ? 1 : 0);

		result.add(pointsAlice);
		result.add(pointsBob);

		return result;

	}

	static void plusMinus(int[] arr) {

		double postive = 0;
		double negative = 0;
		double zero = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				postive++;
			else if (arr[i] < 0)
				negative++;
			if (arr[i] == 0)
				zero++;
		}

		DecimalFormat decimalFormat = new DecimalFormat();
		decimalFormat.setMaximumFractionDigits(6);
		decimalFormat.setMinimumFractionDigits(6);

		System.out.println(decimalFormat.format(Double.valueOf(postive / arr.length)));
		System.out.println(decimalFormat.format(Double.valueOf(negative / arr.length)));

		System.out.println(decimalFormat.format(Double.valueOf(zero / arr.length)));

	}

	static void staircase(int n) {

		StringBuilder sb = new StringBuilder();
		sb.append("#");

		for (int i = n - 1; i >= 0; i--) {
			if (i != 0)
				System.out.println(String.format("%" + i + "s", " ") + sb.toString());
			else {
				System.out.println(sb.toString());
			}
			sb.append("#");
		}

	}

	// Complete the miniMaxSum function below.
	static int birthdayCakeCandles(int[] arr) {

		int max = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i]) {
				count++;
			}
		}

		return count;
	}

	static String timeConversion(String s) {
		/*
		 * Write your code here.
		 */

		StringBuilder sb = new StringBuilder();
		boolean isAm = s.contains("AM");
		
		s = s.replace("AM", "");
		s = s.replace("PM", "");
		
		String str[] = s.split(":");
		int time = Integer.parseInt(str[0]);
		
		
		if(time < 12 && !isAm) {
			time =  time + 12;
			sb.append(time).append(":");
		}else if(time == 12 && isAm) {
			sb.append("00:");
		}else {
			if (time < 10) sb.append("0").append(time).append(":");
			else sb.append(time).append(":");
		}

		sb.append(str[1]).append(":").append(str[2]);
		return sb.toString();
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 3 };
		System.out.println(COmbinationOfAllStrings.timeConversion("16:05:39PM"));

	}

}
