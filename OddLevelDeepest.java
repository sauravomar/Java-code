package Tree;

public class OddLevelDeepest {
	private int level = 0;
	public void oddLevelNode(binaryTree root){
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
				System.out.println(level + "level");
				level++;
				continue;
			}else{
				if(temp.left != null) array[j++] = temp.left;
				if(temp.right != null) array[j++] = temp.right;
			}
		}
		System.out.println("level" + level );
		if(level > 1){
			
			if(level %2 ==1){
				for(j=i-1; j>=0 ; j--){
					if( array[j] != null && array[j].left == null && array[j].right == null){
						temp = array[j];
						System.out.println(temp.data + "data");
					}
					if(array[j] == null){
						break;
					}
				}
			}else{
				for(i=array.length-2; i>0; i--){
					if(array[i]==null){
						break;
					}
				}
				for(j=i; j>0 ; j--){
					if(array[j] != null && array[j].left == null && array[j].right == null){
						temp = array[j];
					}
					if(array[j] == null){
						break;
					}
				}
			}
		}else{
			System.out.println("oddnode"+ root.data);
		}
		System.out.println("oddnode"+ temp.data);
		
	}
	public static void main(String args[]){
		binaryTree root = new binaryTree();
		binaryTree obj = new binaryTree();
		OddLevelDeepest obj1 = new OddLevelDeepest();
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
        obj1.oddLevelNode(root);
		
		
	}


}
