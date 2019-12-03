package com.ril.slot;

public class SnakeAndLadder {

	public static int minSteps(int moves[], boolean visited[], int N, int index) {

		if(index == N-1) return 0;
		
		int count = N+1;
		for (int i = 1; i < 6; i++) {
			
			if ((index + i) < N && !visited[index + i]) {

				if (moves[index + i] > index + 1) {
					visited[moves[index + i]] = true;
					int internalSteps = minSteps(moves, visited, N, moves[index + i]) +1;
					if (internalSteps < count)
						count = internalSteps;
					visited[moves[index + i]] = false;
				}else if(moves[index + i] != 0 && moves[index + i] < index-1) {
					continue;
				}

				visited[index + i] = true;
				int internalSteps = minSteps(moves, visited, N, index + i) +1;
				if (internalSteps < count)
					count = internalSteps;
				visited[index + i] = false;

			}
		}

		return count;

	}

	public static void main(String[] args) {
		int N = 30;
		int moves[] = new int[N];

		// Ladders
		moves[2] = 21;
		moves[4] = 7;
		moves[10] = 25;
		moves[19] = 28;

		// Snakes
		moves[26] = 0;
		moves[20] = 8;
		moves[16] = 3;
		moves[18] = 6;

		boolean visited[] = new boolean[N];

		System.out.println("Min Dice throws required is " + minSteps(moves, visited, N, 0));
	}

}
