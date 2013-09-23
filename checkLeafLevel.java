package Tree;

public class checkLeafLevel {
	static private int height = 0;
	
	public void printPath(int array[], int i){
		System.out.println("path");
		if(height == 0){ 
			height = i;
		}
		if(height != i) {
			System.out.println("not balance" + height);
			System.exit(1);
		}
		for(int j = 0 ; j<=i ;j++){
			
			System.out.println(array[j]);
		}
	}
	public void rootToLeaf(binaryTree root, int pathArray[], int i ){
		if(root.left == null && root.right == null){
			pathArray[i+1] = root.data;
			printPath(pathArray,i+1);
			return;
		}else{
			if(root != null){
				System.out.println(root.data + "right");
				pathArray[i+1] = root.data;
			}
			if(root.left != null) {
				rootToLeaf(root.left, pathArray, i+1);
			}
			if(root.right != null) {
				
				rootToLeaf(root.right, pathArray, i+1);
			}
		}	
		
}
	
	public static void main(String args[]){
		binaryTree root = new binaryTree();
		binaryTree obj = new binaryTree();
		checkLeafLevel obj1 = new checkLeafLevel();
		root = null;
		root = obj.insert(root, 5);
		root = obj.insert(root, 6);
		root = obj.insert(root, 1);
		root = obj.insert(root, 4);
		root = obj.insert(root, 8);
        root = obj.insert(root, 9);
		root = obj.insert(root, 10);
        root = obj.insert(root, 14);
		obj.display(root);
		int pathArray[] = new int [20];
		obj1.rootToLeaf(root, pathArray, -1);
		System.out.println("balanced");

		
	}
}
