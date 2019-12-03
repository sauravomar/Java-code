package com.ril.slot;

import java.util.HashMap;
import java.util.Map;

public class BottomViewBinaryTree {

	Map<Integer, Pair>map = new HashMap<Integer, Pair>();
	int max = 0;
	int min = Integer.MAX_VALUE;
	
	

	class Pair {
		int level;
		int value;

		Pair(int level, int value) {
			this.level = level;
			this.value = value;
		}
	}

	public void bottomView(BinaryTree root, int level , int counter) {
		
		if(root == null)return;
		
		if(counter > max) {
			max = counter;
		}
		
		if(counter < min) {
			min = counter;
		}
		
		if((map.containsKey(counter)&& map.get(counter).level < level) || !map.containsKey(counter)) {
			map.put(counter, new Pair(level, root.data));
		}
		
		if(root.left != null) bottomView(root.left,level+1, counter-1);
		if(root.right != null) bottomView(root.right,level+1, counter+1);
		
		
	}
	
	public void display() {
		
		for(int i = min; i<= max; i++) {
			System.out.println(map.get(i).value);
		}
	}
	
	public static void main(String[] args) {
		BinaryTree root10 = new BinaryTree(10, null, null);
		BinaryTree root14 = new BinaryTree(14, null, null);
		BinaryTree root25 = new BinaryTree(25, null, null);
		BinaryTree root5 = new BinaryTree(5, null, null);
		
		BinaryTree root22 = new BinaryTree(22, null, root25);
		BinaryTree root30 = new BinaryTree(30, root10, root14);
		BinaryTree root8 = new BinaryTree(8, root5, root30);
		
		BinaryTree root = new BinaryTree(20, root8, root22);
		
		BottomViewBinaryTree view = new BottomViewBinaryTree();
		view.bottomView(root, 0, 0);
		view.display();

	}
}

class BinaryTree {

	BinaryTree left;
	BinaryTree right;
	int data;
	
	BinaryTree(int data, BinaryTree left, BinaryTree right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
}
