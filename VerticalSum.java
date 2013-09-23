package Tree;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VerticalSum {
	

	public void VoA(binaryTree root , int i, HashMap sum){
		if(root.left == null && root.right == null){
			if( (Integer)sum.get(i) != null){
				sum.put(i, (Integer) sum.get(i)+ root.data);
			}else{
				sum.put(i, root.data);
			}
			return;
		}else{
			if(root != null){System.out.println(root.data + "right");
				if( (Integer)sum.get(i) != null){
					sum.put(i, (Integer) sum.get(i)+ root.data);
				}else{
					sum.put(i,root.data);
				}
			}
			if(root.left != null) {
				VoA(root.left, i-1, sum);
			}
			if(root.right != null) {
				
				VoA(root.right,i+1, sum);
			}
		}	
		
}
		
		
	
	
	public static void main(String args[]){
		
	
		binaryTree root = new binaryTree();
		binaryTree obj = new binaryTree();
		binaryTree par = new binaryTree();
		VerticalSum obj1 = new VerticalSum();
		HashMap <Integer,Integer> sum = new HashMap<Integer,Integer>();
		root = null;	
		root = obj.insert(root, 5);
		root = obj.insert(root, 3);
		root = obj.insert(root, 4);
		root = obj.insert(root, 1);
		root = obj.insert(root, 8);
		root = obj.insert(root, 6);
        root = obj.insert(root, 9);
		root = obj.insert(root, 10);
        root = obj.insert(root, 14);
		obj.display(root);
		int i =0;
		obj1.VoA(root, i, sum);
		java.util.Iterator<Entry<Integer, Integer>> it = sum.entrySet().iterator();
		 while (it.hasNext()) {
		        Map.Entry pairs = (Map.Entry)it.next();
		        System.out.println(pairs.getKey() + " = " + pairs.getValue());
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		}

	}
	
	
