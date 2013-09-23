package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BtreefromLinkedList {
	
	public binaryTree insert(int data){
			binaryTree temp = new binaryTree();
			temp.data = data;
			temp.right =  null;
			temp.left =  null;
			return temp;
	}
	public binaryTree  listToTree(List<Integer>list){
		binaryTree root = new binaryTree();
		binaryTree tempRoot = new binaryTree();
		tempRoot = null;
		root = null;
		Queue<binaryTree> queue = new LinkedBlockingQueue<binaryTree>();
		int rootData = list.get(0);
		root = insert(rootData);
		queue.add(root);
		list.remove(0);
		for( int i : list){
			if(tempRoot == null || (tempRoot.left != null && tempRoot.right != null)){
				tempRoot = queue.remove();
			}
			if(tempRoot.left == null){
				System.out.println(tempRoot.data + "  temproot data" + i + " left data ");
				tempRoot.left =  insert(i);
				queue.add(tempRoot.left);
			}else if(tempRoot.right == null){
				System.out.println(tempRoot.data + "  temproot data" + i + " right data ");
				tempRoot.right =  insert(i);
				queue.add(tempRoot.right);
			}
		}
		return root;
		
	}

	public static void main(String args[]){
		BtreefromLinkedList obj1 = new BtreefromLinkedList();
		List<Integer> list  = new ArrayList<Integer>();
		binaryTree root = new binaryTree();
		binaryTree  obj = new binaryTree();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		root = obj1.listToTree(list);
		obj.display(root);
        
        }
	
}
