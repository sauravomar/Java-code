package com.ril.slot;

import java.io.IOException;
import java.util.Scanner;

public class LarryArray {

	static int getInvCount(int[] a) {
		int count = 0;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					count++;
				}
			}
		}
		return count;
	}

	// Complete the larrysArray function below.
	static String larrysArray(int[] A) {

		if (getInvCount(A) % 2 == 0)
			return "YES";
		return "NO";

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] A = new int[n];

			String[] AItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int AItem = Integer.parseInt(AItems[i]);
				A[i] = AItem;
			}

			String result = larrysArray(A);
			System.out.println(result);

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
		}

//        bufferedWriter.close();

		scanner.close();
	}
}
