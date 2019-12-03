package com.ril.slot;

import java.util.HashMap;
import java.util.Map;

public class LevelOrderTraveseral {

	int data;

	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	public Node insert(Node root, int data) {
		if (root == null) {
			return this.new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String[] args) {

		LevelOrderTraveseral obj = new LevelOrderTraveseral();

		Map<LevelOrderTraveseral, String> map = new HashMap<>();
		map.put(obj, "1");
		System.out.println(obj.hashCode());

	}

//	@Override
//	public int hashCode() {
//		return data;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		return data == this.data;
//	}

}
