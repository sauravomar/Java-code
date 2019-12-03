package com.ril.slot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MeanMedianMode {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();

		double sum = 0;
		int n, c, max = 0;
		double v;

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			v = sc.nextDouble();
			sum += v;
			list.add(v);
		}

		System.out.println(sum / n);

		Collections.sort(list);

		if (n % 2 == 1) {
			System.out.println(list.get(n / 2));
		} else {
			double median = (list.get((n - 1) / 2) + list.get((n + 1) / 2)) / 2;
			System.out.println(median);
		}

		double mode = list.get(0);

		for (int j = 0; j < n; j++) {
			double itr = list.get(j);
			c = 0;
			for (int k = 0; k < n; k++) {
				if ((itr == list.get(k))) {
					c++;
					if (c > max) {
						max = c;
						if (max == 1) {
							mode = list.get(0);
						}
						mode = itr;
					}
				}
			}
		}

		System.out.println(mode);
		sc.close();
	}
}
