package Tree;

import java.util.Stack;

public class PreOrder {
public void preOrder(binaryTree root){
		
		Stack<binaryTree> BinaryTreeNodestack = new Stack<binaryTree>();
		binaryTree temp =  new binaryTree();
		temp = root;
		System.out.println("data on pop "+temp.data ) ;
		BinaryTreeNodestack.push(temp);
		while(!BinaryTreeNodestack.isEmpty() && temp != null){
			while(temp.left != null){
				temp = temp.left;
				System.out.println("data on pop "+temp.data ) ;
				BinaryTreeNodestack.push(temp);
			}if(temp.left == null){
				temp =  BinaryTreeNodestack.pop();
				temp = temp.right;
				
				if(temp != null) {
					BinaryTreeNodestack.push(temp);
					System.out.println("data on pop "+temp.data ) ;
				}
				while(temp == null) {
					if(!BinaryTreeNodestack.isEmpty()){
						temp = BinaryTreeNodestack.pop();
						temp = temp.right;
						if(temp != null){
							System.out.println("data on pop "+temp.data ) ;
							BinaryTreeNodestack.push(temp);
						}
					}
					
				}
			}
			
			
	}
}	
	public static void main(String args[]){
		binaryTree root = new binaryTree();
		binaryTree obj = new binaryTree();
		PreOrder obj1 = new PreOrder();
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
        obj1.preOrder(root);
		obj.display(root);
		

		
	}

}
