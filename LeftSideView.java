package Tree;

public class LeftSideView {
	public void leftView(binaryTree root){
		binaryTree [] array = new binaryTree[20];
		int i = 0,j = 0;
		binaryTree temp =  new binaryTree();
		array[j++] = root;
		array[j++] = null;
		while(i+1 != j){
			temp = array[i++];
			if(temp != null) System.out.println(temp.data);
			if(temp == null) {
				array[j++] = null;
				continue;
			}else{
				if(temp.left != null) array[j++] = temp.left;
				if(temp.right != null) array[j++] = temp.right;
			}
		}
		System.out.println("from left" + array[0].data);
		for(i =0 ; i<array.length ; i++){
			if(array[i] == null){
				if(i+1 <array.length && array[i+1] != null ) System.out.println("from left" + array[i+1].data);
			}
				
		}

	}
	public static void main(String args[]){
		binaryTree root = new binaryTree();
		binaryTree obj = new binaryTree();
		LeftSideView obj1 = new LeftSideView();
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
        obj1.leftView(root);
		
		
	}

}
