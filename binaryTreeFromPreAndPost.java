package Tree;

public class binaryTreeFromPreAndPost {	
	static int preIndex = 0;
	public binaryTree convert(int pre[], int post[], int preIndex ,int l, int h,  int size ){
		
		
		
		if (preIndex >= size || l> h){
	        return null;
		}
		binaryTree temp = new binaryTree();
		temp.data = pre[preIndex];
	    preIndex =  preIndex + 1 ;
		
	    if (l == h)
	        return temp;

	    int i;
	    for (i = l; i < h; ++i){
	        if (pre[preIndex] == post[i])
	            break;
	    	}
	    System.out.println(i + "i value");
	    if (i <= h){
	        temp.left = convert (pre, post, preIndex, l, i, size);
	        temp.right = convert (pre, post, preIndex, i + 1, h, size);
	    }
	    
	 
	    return temp;
	}
	 
	public static void main( String args[]){
		int pre[] = {1,2,4,5,3,6,7};
		int post[] = {4,5,2,6,7,3,1};
		binaryTreeFromPreAndPost obj = new binaryTreeFromPreAndPost();
		binaryTree root = obj.convert(pre, post, obj.preIndex , 0, 6, 6);
		new binaryTree().display(root);
		
	}
		
}
