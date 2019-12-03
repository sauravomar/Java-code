package com.ril.slot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OverlappingIntervals {

	int minimumTime(int numOfParts, List<Integer> parts) {

		int min = 0;
		Collections.sort(parts);

		for (int i = 0; i < parts.size() - 1; i++) {
			min = min + parts.get(i) + parts.get(i + 1);
			parts.set(i + 1, parts.get(i) + parts.get(i + 1));
		}

		return min;

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(4);
		list.add(6);
		list.add(12);
		System.out.println(new OverlappingIntervals().minimumTime(4, list));
	}
}
