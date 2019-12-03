package com.ril.slot;

public class Bomber {

	private static boolean isSafe(int n, int row, int col) {
		if (row >= n || col >= n || row < 0 || col < 0)
			return false;
		return true;
	}

	static String[] bomberMan(int n, String[] grid) {
		init(grid);

		for (int i = 2; i <=n; i++) {
			if (i % 2 == 0)
				set(grid);
			else
				clear(grid);

		}

		response(grid);
		return grid;
	}

	private static void clear(String grid[]) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length(); j++) {
				if (Integer.parseInt(grid[i].charAt(j) + "") == 2)
					clear(grid, i, j);
			}
		}
	}

	private static void clear(String grid[], int row, int col) {

		int rows[] = { -1, 1 };
		int cols[] = { -1, 1 };

		if(isSafe(grid.length, row-1, col)) {
			grid[row-1] = grid[row-1].substring(col-1) + "0" + grid[row-1].substring(col+1);
		}
		
		if(isSafe(grid.length, row+1, col)) {
			grid[row-1] = grid[row+1].substring(col-1) + "0" + grid[row+1].substring(col+1);
		}

	}

	private static void set(String grid[]) {
		for (int i = 0; i < grid.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < grid[0].length(); j++) {
				sb.append(Integer.parseInt(grid[i].charAt(j) + "") + 1);
			}
			grid[i] = sb.toString();
			sb.setLength(0);
		}
	}

	private static void init(String grid[]) {
		for (int i = 0; i < grid.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < grid[0].length(); j++) {
				if (grid[i].charAt(j) == '.') {
					sb.append("0");
				} else {
					sb.append("1");
				}

			}
			grid[i] = sb.toString();
			sb.setLength(0);
		}
	}

	private static void response(String grid[]) {
		for (int i = 0; i < grid.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < grid[0].length(); j++) {
				if (Integer.parseInt(grid[i].charAt(j) + "") != 0) {
					sb.append("0");
				} else {
					sb.append(".");
				}

			}
			grid[i] = sb.toString();
			sb.setLength(0);
		}
	}

	public static void main(String[] args) {
		String[] grid = {
				".......",
				"...O...",
				"....O..",
				".......",
				"OO.....",
				"OO....."
		};
		
		bomberMan(3, grid);
	}

}
