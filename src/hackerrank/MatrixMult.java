package com.ril.slot;

public class MatrixMult {

	public int getProduct(int arr[]) {
		int mat[][] = new int[arr.length][arr.length];

		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				int prod1 = arr[j] * arr[j - 1] * arr[j + i] + mat[j + 1][j + i];
				int prod2 = arr[j - 1] * arr[j + i - 1] * arr[j + i] + mat[j][j + i - 1];
				mat[j][j + i] = Math.min(prod1, prod2);
			}

		}

		return mat[1][arr.length - 1];

	}

	public static void main(String[] args) {
		System.out.println(new MatrixMult().getProduct(new int[] { 10, 20, 30, 40, 30 }));
	}
}
