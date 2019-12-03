package com.ril.slot;

import java.util.ArrayList;
import java.util.List;

public class Boogle {

	static List<String> results = new ArrayList<String>();

	boolean isValidMove(Trie trie, int x, int y, int size) {
		if (x >= 0 && x < size && y >= 0 && y < size)
			return true;
		return false;
	}

	public void findWords(char boogle[][], Trie trie) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < boogle.length; i++) {
			for (int j = 0; j < boogle[0].length; j++) {
				if (trie.children[boogle[i][j] - 'a' + 32] != null) {
					sb.setLength(0);
					sb.append(boogle[i][j]);
					boolean visited[][] = new boolean[boogle.length][boogle.length];
					visited[i][j] = true;
					check(boogle, trie.children[boogle[i][j] - 'a' + 32], i, j, sb, visited);
				}
			}
		}
		results.stream().forEach(str -> System.out.println(" found " + str));
	}

	public void check(char boogle[][], Trie trie, int x, int y, StringBuilder sb, boolean visited[][]) {

		int row[] = { -1, -1, 0, 1, 1, 1, 0, 0 };
		int col[] = { -1, 0, -1, -1, 0, 1, 1, 1 };

		if (trie.isEnd)
			results.add(sb.toString());

		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < col.length; j++) {

				int newRow = row[i] + x;
				int newCol = col[j] + y;

				if (isValidMove(trie, newRow, newCol, boogle.length) && !visited[newRow][newCol]
						&& trie.children[boogle[newRow][newCol] - 'a' + 32] != null) {
					sb.append(boogle[newRow][newCol]);
					visited[newRow][newCol] = true;
					check(boogle, trie.children[boogle[newRow][newCol] - 'a' + 32], newRow, newCol, sb, visited);
				}
			}
		}

	}

	public static void main(String args[]) {
		String dictionary[] = { "GEEKS", "FOR", "QUIZ", "GEE" };
		Boogle obj = new Boogle();

		Trie trie = new Trie();

		int n = dictionary.length;

		for (int i = 0; i < n; i++)
			trie.insert(dictionary[i], trie);

		char boggle[][] = { { 'G', 'I', 'Z' }, { 'U', 'E', 'K' }, { 'Q', 'S', 'E' } };

		obj.findWords(boggle, trie);

	}

}
