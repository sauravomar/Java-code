package com.ril.slot;

public class BinomialCoefficient {

	public int getVal(int n, int k) {

		int dp[][] = new int[n + 1][k + 1];

		for (int i = 0; i < k + 1; i++)
			dp[0][i] = 1;

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= Math.min(i, k); j++) {

				if (j == 0 || j == i)
					dp[i][j] = 1;

				else
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
			}
		}

		return dp[n][k];
	}

	public static void main(String[] args) {
		System.out.println(new BinomialCoefficient().getVal(5, 2));
	}

}
