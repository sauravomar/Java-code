package com.ril.slot;

public class WordBreakProblem {

	class Trie {
		Trie children[] = new Trie[26];
		boolean isEnd;

		@Override
		public String toString() {
			return children.toString() + isEnd;
		}
	}

	public void insert(String str, Trie root) {

		if (str.length() == 0)
			return;

		if (root.children[str.charAt(0) - 'a'] == null) {
			root.children[str.charAt(0) - 'a'] = new Trie();
		}

		if (str.length() == 1)
			root.children[str.charAt(0) - 'a'].isEnd = true;
		else
			insert(str.substring(1), root.children[str.charAt(0) - 'a']);
	}

	public boolean search(String str, Trie root) {

		if (str.length() == 1 && root.children[str.charAt(0) - 'a'] != null && root.children[str.charAt(0) - 'a'].isEnd)
			return true;
		else if (str.length() == 1)
			return false;
		return root.children[str.charAt(0) - 'a'] != null
				&& search(str.substring(1), root.children[str.charAt(0) - 'a']);

	}

	public boolean wordBreak(String str, Trie root) {

		if(str.length() == 0) return true;
		
		boolean isPresent = false;

		for (int i = 1; i <= str.length(); i++) {
			if(search(str.substring(0, i), root)) {
				isPresent = wordBreak(str.substring(i), root);
			}
		}
		return isPresent;

	}

	public static void main(String[] args) {

		String str[] = { "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go",
				"mango" };

		WordBreakProblem wordBreak = new WordBreakProblem();
		Trie root = wordBreak.new Trie();

		for (int i = 0; i < str.length; i++) {
			wordBreak.insert(str[i], root);
		}

		String find = "ilikesamsung";
		System.out.println(wordBreak.wordBreak(find, root));

	}

}
