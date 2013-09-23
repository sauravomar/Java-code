package Tree;

import java.util.Stack;

public class Inorder {

	public binaryTree[] inOrder(binaryTree root){
		
		Stack<binaryTree> BinaryTreeNodestack = new Stack<binaryTree>();
		binaryTree array[] = new binaryTree[20];
		int i=0;
		binaryTree temp =  new binaryTree();
		temp = root;
		BinaryTreeNodestack.push(temp);
		while(!BinaryTreeNodestack.isEmpty()){
			while(temp.left != null){
				temp = temp.left;
				BinaryTreeNodestack.push(temp);
			}if(temp.left == null){
				temp =  BinaryTreeNodestack.pop();
				System.out.println("data on pop "+temp.data ) ;
				array[i++] = temp;
				temp = temp.right;
				if(temp != null) BinaryTreeNodestack.push(temp);
				while(temp == null) {
					if(!BinaryTreeNodestack.isEmpty()){
					temp = BinaryTreeNodestack.pop();
					System.out.println("data on pop "+temp.data) ;
					array[i++] = temp;
					temp = temp.right;
					if(temp != null) BinaryTreeNodestack.push(temp);
					}else break;
				}
			
			}
	}	
		System.out.println("checking");
	return array;	
}	
	public static void main(String args[]){
		binaryTree root = new binaryTree();
		binaryTree obj = new binaryTree();
		Inorder obj1 = new Inorder();
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
        obj1.inOrder(root);
		obj.display(root);
		

		
	}

}
