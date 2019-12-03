package com.ril.slot;

public class KnapSackProblem {

	int arr[][];

	private int calculate(int weight, int wt[], int val[], boolean picked[]) {

		if (weight == 0)
			return 0;
		if (weight < 0)
			return -1;
		int max = 0;

		for (int i = 0; i < wt.length; i++) {
			int value = 0;

			if (picked[i] == false) {
				if (weight - wt[i] > 0) {
					picked[i] = true;
					value = calculate(weight - wt[i], wt, val, picked) + val[i];
					picked[i] = false;
				} else if (weight == wt[i]) {
					value = val[i];
				}
				if (value > max)
					max = value;
			}
		}
		return max;
	}

	private void knapSackUtil(int weight, int wt[], int val[]) {
		this.arr = new int[wt.length][wt.length];
		boolean picked[] = new boolean[wt.length];
		System.out.println(calculate(weight, wt, val, picked));
	}

	public static void main(String[] args) {
		int val[] = { 60, 100, 120 };
		int wt[] = { 10, 20, 30 };
		int W = 50;

		new KnapSackProblem().knapSackUtil(W, wt, val);

	}
}
