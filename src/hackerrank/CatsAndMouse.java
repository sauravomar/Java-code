package com.ril.slot;

public class CatsAndMouse {

	static String catAndMouse(int x, int y, int z) {

		int xDist = Math.abs(z - x);
		int yDist = Math.abs(z - y);

		if (xDist == yDist)
			return "Mouse C";
		else if (xDist > yDist)
			return "Cat B";
		else
			return "Cat A";
	}
}
