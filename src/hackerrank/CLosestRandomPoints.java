package com.ril.slot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CLosestRandomPoints {

	static long closestSquaredDistance(List<Integer> x, List<Integer> y) {

		Collections.sort(x);
        Collections.sort(y);

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        long minDist = Integer.MAX_VALUE;

        for (int i = 0; i < x.size() - 1; i++) {
            if (x.get(i + 1) - x.get(i) < minX || y.get(i + 1) - y.get(i) < minY) {
                minX = x.get(i + 1) - x.get(i);
                minY = y.get(i + 1) - y.get(i);
                long newDist = (long) ((long) Math.pow(minX, 2) + Math.pow(minY, 2));
                if(newDist < minDist)minDist = newDist;
            }
        }
        return (long) ((long) Math.pow(minX, 2) + Math.pow(minY, 2));

	}

	public static void main(String[] args) {
		List<Integer> x = new ArrayList<Integer>();
		x.add(77);
		x.add(1000);
		x.add(992);
		x.add(1000000);

		List<Integer> y = new ArrayList<Integer>();
		y.add(0);
		y.add(1000);
		y.add(500);
		y.add(0);
		
	System.out.println(CLosestRandomPoints.closestSquaredDistance(x, y));
	}

}
