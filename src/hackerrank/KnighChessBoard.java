package com.ril.grocery.slotManagement.redis.publisher;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KnighChessBoard {

	static int xAxis[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
	static int yAxis[] = { -1, -2, -2, -1, 1, 2, 2, 1 };

	// Class for storing a cell's data
	static class Cell {
		int x, y;
		int dis;

		public Cell(int x, int y, int dis) {
			this.x = x;
			this.y = y;
			this.dis = dis;
		}

	}

	static boolean isValid(int x, int y, int n, int m) {
		if (x <= n && y <= m && x >= 1 && y >= 1) {
			return true;
		}
		return false;
	}

	public static int minimumSteps(Cell src, Cell dest, int n, int m) {

		boolean visited[][] = new boolean[n + 1][m + 1];
		Queue<Cell> queue = new LinkedList<Cell>();

		queue.add(src);

		while (!queue.isEmpty()) {

			Cell cell = queue.remove();

			if (cell.x == dest.x && cell.y == dest.y)
				return cell.dis;

			for (int i = 0; i < 8; i++) {
				int x = cell.x + xAxis[i];
				int y = cell.y + yAxis[i];

				if (isValid(x, y, n, m) && !visited[x][y]) {
					visited[x][y] = true;
					queue.add(new Cell(x, y, cell.dis + 1));
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		for (int i = 0; i < testCase; i++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();

			Cell src = new Cell(scanner.nextInt(), scanner.nextInt(), 0);
			Cell dest = new Cell(scanner.nextInt(), scanner.nextInt(), 0);
			System.out.println(KnighChessBoard.minimumSteps(src, dest, n, m));
		}

	}

}
