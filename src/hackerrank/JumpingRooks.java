package com.ril.slot;

public class JumpingRooks {

	static int jumpingRooks(int k, String[] board) {
		return (k - fill(board)) * 2;
	}

	private static int fill(String[] board) {

		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length(); j++) {
				if (board[i].charAt(j) == '.') {
					fillRow(board, i, j);
					fillCol(board, i, j);
					count++;
				}
			}
		}
		return count;
	}

	private static void fillRow(String[] board, int row, int col) {
		String str = board[row];
		StringBuilder sb = new StringBuilder(str.substring(0, col));
		for (int j = col; j < str.length(); j++) {
			if (str.charAt(j) == '#') {
				sb.append(str.substring(j));
				board[row] = sb.toString();
				return;
			}
			sb.append('0');
		}

		board[row] = sb.toString();

	}

	private static void fillCol(String[] board, int row, int col) {
		
		StringBuilder sb = new StringBuilder();

		for (int j = row; j < board.length; j++) {

			
			
			String str = board[j];
			
			if (str.charAt(col) == '#') {
				return;
			}

			sb.append(str.substring(0, col));
			sb.append('0');
			sb.append(str.substring(col + 1, str.length()));
			board[j] = sb.toString();
			sb.setLength(0);

			

		}
	}

	public static void main(String[] args) {
		String board[] = new String[] { "..#..", "..#..", "#####", "..#..", "..#..", };

		System.out.println(jumpingRooks(10, board));
	}
}
