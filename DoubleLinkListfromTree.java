package Tree;

public class DoubleLinkListfromTree {
	private DoubleLinkListfromTree prev;
	private DoubleLinkListfromTree next;
	private int data;
	public DoubleLinkListfromTree doubleLinkList(binaryTree  root){
		DoubleLinkListfromTree tempRootleft = new DoubleLinkListfromTree(); 
		DoubleLinkListfromTree tempRootright = new DoubleLinkListfromTree(); 
		if(root == null) return null;
		else{
			tempRootleft  = doubleLinkList(root.left);
			tempRootright = doubleLinkList(root.right);
			if(root != null && tempRootleft  == null && tempRootright  == null){
				DoubleLinkListfromTree temp = new DoubleLinkListfromTree();
				temp.data = root.data;
				temp.prev = null;
				temp.next = null;
				System.out.println(temp.data  + "temp.data");
				return temp;
			}else{
				DoubleLinkListfromTree temp = new DoubleLinkListfromTree();
				temp.data = root.data;
				System.out.println(temp.data  + "tempelse.data");
				if(tempRootleft != null){
					while(tempRootleft.next!= null){
						tempRootleft = tempRootleft.next;
						System.out.println(tempRootleft.data + "  leftdata");
					}
				}
				temp.prev = tempRootleft;
				if(tempRootleft != null) tempRootleft.next = temp;
					
				if(tempRootright != null){
					while(tempRootright.prev != null){
						tempRootright = tempRootright.prev;
						System.out.println(tempRootright.data + "  righttdata");
					}
				}
				
				temp.next = tempRootright;
				if(tempRootright != null) tempRootright.prev = temp;
				
				System.out.println(temp.data + "tempElseData " + temp.prev + temp.next);
				return temp;
			}
		}
	}
	
	public static void main(String args[]){
		binaryTree root = new binaryTree();
		binaryTree obj = new binaryTree();
		DoubleLinkListfromTree obj1 = new DoubleLinkListfromTree();
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
		obj.display(root);
		DoubleLinkListfromTree tempRoot = new DoubleLinkListfromTree(); 
		DoubleLinkListfromTree temp = new DoubleLinkListfromTree(); 
		tempRoot = obj1.doubleLinkList(root);
		temp = tempRoot;
		while(tempRoot.prev != null){
			System.out.println(tempRoot.data + "data vjhvjhv");
			tempRoot = tempRoot.prev;
		}
		while(tempRoot!=null){
			System.out.println(tempRoot.data + "data");
			tempRoot = tempRoot.next;
		}

		
	}


}
