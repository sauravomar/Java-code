package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by saurav on 3/7/14.
 */
public class DiffOddEvenLevel {

    public void levelOrder(BinaryTree root){

        BinaryTree temp = root;
        Queue<BinaryTree> que =  new LinkedList<BinaryTree>();
        que.add(temp);
        que.add(null);
        int level = 1;
        int odd = 0;
        int even = 0;
        System.out.print("level " + level + " data ");
        while (!que.isEmpty()){

            temp = que.remove();
            if(que.isEmpty()) break;

            if(temp == null && !que.isEmpty()){
                level++;
                System.out.println();
                System.out.print("level " + level);
                que.add(null);
            }else{
                if(level%2 ==1) odd = odd + temp.data;
                if(level%2 ==0) even = even + temp.data;
                if(temp.left != null) que.add(temp.left);
                if(temp.right != null) que.add(temp.right);
            }

        }
        System.out.println("difference "+(odd-even));
    }
    public static void main(String args[]){

        BinaryTree obj = new BinaryTree();
        BinaryTree root = null;
        DiffOddEvenLevel object = new DiffOddEvenLevel();
        root = obj.insert(root,5);
        root = obj.insert(root,8);
        root = obj.insert(root,3);
        root = obj.insert(root,4);
        root = obj.insert(root,2);
        root = obj.insert(root,6);
        root = obj.insert(root,9);

        object.levelOrder(root);

    }
}
