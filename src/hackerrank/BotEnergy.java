package com.ril.slot;

public class BotEnergy {

	static int chiefHopper(int[] arr) {

		int energy = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			energy = getEnergy(energy, arr[i]);
		}
		return energy;
	}

	static int getEnergy(int e, int height) {
		return (int) Math.ceil((e + height + 1) / 2);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 3, 7, 8, 6, 4 };
		BotEnergy.minimumBribes(arr);
	}

	static int[] rotLeft(int[] a, int d) {

		int arr[] = new int[d];
		int length = a.length;

		for (int i = 0; i < d; i++) {
			arr[i] = a[i];
		}

		for (int i = 0; i < length - d; i++) {
			a[i] = a[i + d];
		}

		int index = 0;
		for (int i = length - d; i < length; i++) {
			a[i] = arr[index++];

		}

		return a;

	}

	static void minimumBribes(int[] q) {

		int count = 0;
		
		for (int i = q.length - 1; i >= 0; i--) {
	        if (q[i] - (i + 1) > 2) {
	        	System.out.println("Too chaotic");
	            return;
	        }
	        for (int j = Math.max(0, q[i] - 2); j < i; j++)
	            if (q[j] > q[i]) count++;
	    }

		System.out.println(count);

	}
}
