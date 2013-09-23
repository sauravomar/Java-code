package Tree;

class binaryTree{
	public int data;
	public  binaryTree left;
	public  binaryTree right;

	public binaryTree insert(binaryTree root, int data){
	
		if(root == null){
			binaryTree temp = new binaryTree();
                	temp.left = null;
                	temp.right = null;
                	temp.data = data;
			root = temp;
		}else{
			if(root.data > data)
				root.left = insert(root.left, data);
			if(root.data < data)	
				root.right = insert(root.right, data);
		}
		return root;
	}
	public binaryTree[] levelOrder(binaryTree root){
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
		for (i=0; i<j ; i++){
			if(array[i] != null){
				System.out.println(array[i].data);
			}else{
				System.out.println("null");
				continue;
			}
		}
		return array;
	}
	public void display(binaryTree root){
		binaryTree temp = new binaryTree();
		temp = root;
		if(root == null) return ;

		if(root.left != null) display(root.left);

		System.out.println("data->" + root.data);

		if(root.right != null) display(root.right);
	}
	public static void main(String args[]){
		binaryTree root = new binaryTree();
		binaryTree obj = new binaryTree();
		binaryTree par = new binaryTree();
		root = null;
		par  = null; 	
		root = obj.insert(root, 5);
		root = obj.insert(root, 6);
		root = obj.insert(root, 1);
		root = obj.insert(root, 4);
		root = obj.insert(root, 8);
        root = obj.insert(root, 9);
		root = obj.insert(root, 10);
        root = obj.insert(root, 14);
		obj.display(root);
		obj.levelOrder(root);

		
	}
} 
