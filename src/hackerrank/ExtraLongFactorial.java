package com.ril.slot;

import java.math.BigInteger;

public class ExtraLongFactorial {

	static void extraLongFactorials(int n) {
		BigInteger result = BigInteger.ONE;

		for (int i = 1; i <= n; i++) {
			result = result.multiply(new BigInteger("" + i));
		}

		System.out.println(result);
	}
	
	public static void main(String[] args) {
		ExtraLongFactorial.extraLongFactorials(25);
	}

}
