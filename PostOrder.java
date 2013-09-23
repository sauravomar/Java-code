package Tree;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrder {
	

public void postOrder(binaryTree root){
		
		Stack<binaryTree> BinaryTreeNodestack = new Stack<binaryTree>();
		binaryTree current = new binaryTree();
		binaryTree parent = new binaryTree();
		current = root.left;
		BinaryTreeNodestack.push(root.right);
		BinaryTreeNodestack.push(root);
		
		
		do
	    {
	        // Move to leftmost node
	        while (root != null)
	        {
	           
	            if (root.right != null){
	            	BinaryTreeNodestack.push( root.right);
	            	BinaryTreeNodestack.push(root);
	            }
	            root = root.left;
	        }
	        root = BinaryTreeNodestack.pop();
	        if (root.right != null && !BinaryTreeNodestack.isEmpty() &&BinaryTreeNodestack.peek() == root.right)
	        {
	        	BinaryTreeNodestack.pop();  
	        	BinaryTreeNodestack.push(root);  
	            root = root.right; 
	                                
	        }
	        else  
	        {
	           System.out.println(root.data);
	            root = null;
	        }
	    } while (!BinaryTreeNodestack.isEmpty());
	}
		
	
	public static void main(String args[]){
		binaryTree root = new binaryTree();
		binaryTree obj = new binaryTree();
		PostOrder obj1 = new PostOrder();
		root = null;
		root = obj.insert(root, 5);
		root = obj.insert(root, 3);
		root = obj.insert(root, 2);
		root = obj.insert(root, 1);
		root = obj.insert(root, 4);
        root = obj.insert(root, 10);
		root = obj.insert(root, 7);
        root = obj.insert(root, 8);
        root = obj.insert(root, 6);
		root = obj.insert(root, 11);
        root = obj.insert(root, 9);
        root = obj.insert(root, 12);
        obj1.postOrder(root);
		obj.display(root);
		

		
	}


}
