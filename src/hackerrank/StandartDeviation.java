package com.ril.slot;

import java.util.ArrayList;
import java.util.Scanner;

public class StandartDeviation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();

		int n = sc.nextInt();
		double sum = 0;

		for (int i = 0; i < n; i++) {
			double val = sc.nextDouble();
			list.add(val);
			sum = sum + val;
		}

		double mean = sum / n;
		double sd = 0;

		for (int i = 0; i < n; i++) {
			sd = sd + Math.pow(list.get(i) - mean, 2);
		}

		sd = sd / n;
		System.out.printf("%.1f",Math.sqrt(sd));
		sc.close();
	}

}
