package com.ril.slot;

public class Trie {

	Trie children[] = new Trie[26];
	boolean isEnd;

	@Override
	public String toString() {
		return children.toString() + isEnd;
	}

	public void insert(String str, Trie root) {

		if (str.length() == 0)
			return;

		if (root.children[str.toLowerCase().charAt(0) - 'a'] == null) {
			root.children[str.toLowerCase().charAt(0) - 'a'] = new Trie();
		}

		if (str.length() == 1)
			root.children[str.toLowerCase().charAt(0) - 'a'].isEnd = true;
		else
			insert(str.substring(1), root.children[str.toLowerCase().charAt(0) - 'a']);
	}

	public boolean search(String str, Trie root) {

		if (str.length() == 1 && root.children[str.charAt(0) - 'a'] != null && root.children[str.charAt(0) - 'a'].isEnd)
			return true;
		else if (str.length() == 1)
			return false;
		return root.children[str.charAt(0) - 'a'] != null
				&& search(str.substring(1), root.children[str.charAt(0) - 'a']);

	}
}
