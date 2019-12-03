package com.ril.slot;

public class LowestNumber {

	public int getLowestNumber(int number, int n) {
		StringBuilder sb = new StringBuilder();

		int arr[] = sort(number);
		int count = n;

		for (int i = 9; i > 0; i--) {
			if (count == 0)
				break;

			else if (arr[i] != 0) {

				if (count > arr[i]) {
					count = count - arr[i];
					arr[i] = 0;
				} else {
					arr[i] = arr[i] - count;
					count = 0;
				}

			}
		}

		String str = Integer.toString(number);

		for (int i = str.length() - 1; i > 0; i--) {

			if (arr[Integer.parseInt("" + str.charAt(i))] != 0) {
				sb.append(str.charAt(i));
				arr[Integer.parseInt("" + str.charAt(i))] = arr[Integer.parseInt("" + str.charAt(i))] - 1;
			}

		}
		return Integer.parseInt(sb.toString());

	}

	private int[] sort(int number) {

		int arr[] = new int[10];
		int num = 0;

		while (number > 0) {
			num = number % 10;
			arr[num] = arr[num] + 1;
			number = number / 10;
		}

		return arr;
	}
	
	public static void main(String[] args) {
		LowestNumber obj = new LowestNumber();
		System.out.println(obj.getLowestNumber(4325043, 3));
			
	}

}
