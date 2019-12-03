package com.ril.grocery.slotManagement.redis.publisher;

import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void findPrime(int start, int end) {
		boolean[] isPrime = new boolean[end + 1];

		for (int i = 2; i <= end; i++)
			isPrime[i] = true;

		for (int i = 2; i * i <= end; i++) {
			if (isPrime[i] == true) {
				for (int j = i * i; j <= end; j = j + i) {
					isPrime[j] = false;
				}
			}
		}

		// Print all prime numbers
		for (int i = start; i <= end; i++) {
			if (isPrime[i] == true)
				System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		for (int i = 0; i < testCase; i++) {
			int start = scanner.nextInt();
			int end = scanner.nextInt();
			SieveOfEratosthenes.findPrime(start, end);
			System.out.println();
		}

	}
}
