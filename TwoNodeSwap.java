package Tree;

public class TwoNodeSwap {
	private int flag = 0;
	 public void twoSwap(binaryTree root){
		 if(root == null) return ;
		 binaryTree array[] = new Inorder().inOrder(root);
		 binaryTree swap = new binaryTree(); 
		 swap = null;
		 for( int i=1 ; i<array.length ; i++ ){
			 if(array[i] != null){
			 if(array[i].data < array[i-1].data ){
				 if(flag == 0 &&  swap == null){
					 System.out.println(array[i] .data + "swap.data");
					 swap = array[i-1] ; flag = 1;
				 }else{
					 System.out.println("swapping.data");
					 flag = swap.data;
					 swap.data = array[i].data;
					 array[i].data = flag;
				 }
			 }	
		 }
	}
		 
	 }

	 public static void main(String args[]){
			binaryTree root = new binaryTree();
			binaryTree obj = new binaryTree();
			int val;
			TwoNodeSwap obj1 = new TwoNodeSwap();
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
	        val = root.left.data ;
	        root.left.data = root.right.left.data;
	        root.right.left.data = val;
	        obj.display(root);
	        obj1.twoSwap(root);
	        obj.display(root);
			
			
		}
}
