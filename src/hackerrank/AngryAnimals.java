package com.ril.slot;

import java.util.ArrayList;
import java.util.List;

public class AngryAnimals {

	public static long angryAnimals(int n, List<Integer> a, List<Integer> b) {
		int[] Aarray = a.stream().mapToInt(i->i).toArray();
		int[] Barray = a.stream().mapToInt(i->i).toArray();
		return count(1, n, new boolean[n + 2], Aarray, Barray, 0, 1, 0);
	}

	public static int count(int start, int n, boolean[] used, int[] a, int[] b, int numgroup, int cur, int c) {
		if (start <= n || cur != n) {
			used[start] = true;
			numgroup++;

			if (numgroup == 1) {
				c++;
				return count(start + 1, n, used, a, b, numgroup, start, c);
			}

			for (int j = 0; j < a.length; j++) {
				if (used[a[j]] && used[b[j]]) {
					return count(cur + 1, n, new boolean[n + 1], a, b, 0, cur, c);
				}
			}

			c++;

			if (start == n) {
				return count(cur + 1, n, new boolean[n + 1], a, b, 0, cur, c);
			}

			return count(start + 1, n, used, a, b, numgroup, cur, c);
		}
		return c;
	}

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(3);

		List<Integer> b = new ArrayList<Integer>();
		b.add(8);
		b.add(5);
		b.add(6);
		b.add(4);

		System.out.println(angryAnimals(8, a, b));

	}
}
