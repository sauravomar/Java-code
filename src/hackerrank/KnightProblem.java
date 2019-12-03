package com.ril.slot;

public class KnightProblem {

	public boolean isSafe(int x, int y, int sol[][]) {
		return x >= 0 && y >= 0 && x < sol.length && y < sol[0].length && sol[x][y] == -1;
	}

	public boolean solve(int sol[][], int x, int y, int move) {

		if (move == sol.length * sol.length)
			return true;

		int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
		int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

		for (int i = 0; i < 8; i++) {
			
			int nextX = x + xMove[i];
			int nextY = y + yMove[i];

			if (isSafe(nextX, nextY, sol)) {
				sol[nextX][nextY] = move;
				boolean result = solve(sol, nextX, nextY, move + 1);
				if (result == true)
					return true;
				else
					sol[nextX][nextY] = -1;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		int sol[][] = new int[8][8];

		for (int i = 0; i < sol.length; i++)
			for (int j = 0; j < sol.length; j++)
				sol[i][j] = -1;

		sol[0][0] = 1;

		System.out.println(new KnightProblem().solve(sol, 0, 0, 1));
		System.out.println();
	}

}
