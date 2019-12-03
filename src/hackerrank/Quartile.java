package com.ril.slot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Quartile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Double> weight = new ArrayList<Double>();
		ArrayList<Double> list = new ArrayList<Double>();

		int n = sc.nextInt();
		double totalEle = 0;

		for (int i = 0; i < n; i++) {
			list.add(sc.nextDouble());
		}

		for (int i = 0; i < n; i++) {
			double val = sc.nextDouble();
			weight.add(val);
			totalEle = totalEle + val;
		}

		double arr[] = new double[(int)totalEle];
		int index = 0;

		for (int i = 0; i < n; i++) {
			double val = weight.get(i);
			while (val > 0) {
				arr[index++] = list.get(i);
				val--;
			}

		}

		Arrays.sort(arr);

		int len = (int)totalEle / 2;

		double q1 = 0;

		if (len % 2 == 0) {
			q1 = (arr[(len - 1) / 2] + arr[(len + 1) / 2]) / 2;
		} else {
			q1 = arr[len / 2];
		}

		double q3 = 0;

		if (totalEle % 2 == 0) {
			q3 = (arr[len + (len - 1) / 2] + arr[len + (len + 1) / 2]) / 2;
		} else {
			if(len%2 == 0)  q3 = arr[ len+(len/ 2)];
			else q3 = arr[ len+(len+1/ 2)];
		}
		System.out.printf("%.1f",q3 - q1);
	}
}
