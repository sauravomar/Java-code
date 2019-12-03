package com.ril.slot;

import java.util.ArrayList;
import java.util.Scanner;

public class WeightedMean {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Double> weight = new ArrayList<Double>();
		ArrayList<Double> list = new ArrayList<Double>();

		int n = sc.nextInt();
		double sum = 0;
		double total = 0;

		for (int i = 0; i < n; i++) {
			weight.add(sc.nextDouble());
		}

		for (int i = 0; i < n; i++) {
			double val = sc.nextDouble();
			list.add(val);
			sum = sum + val;
		}

		for (int i = 0; i < n; i++) {
			total = total + list.get(i) * weight.get(i);
		}

		 System.out.printf("%.1f", total/sum);
	}
}
