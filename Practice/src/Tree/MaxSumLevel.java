package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by saurav on 7/6/14.
 */
public class MaxSumLevel {

    public void maxLevel(BinaryTree root){

        BinaryTree temp = root;
        Queue<BinaryTree> que =  new LinkedList<BinaryTree>();
        que.add(temp);
        que.add(null);
        int level = 1,currentSum = 0,maxSum = 0,maxLevel = 1;

        System.out.print("level " + level + " data ");

        while (!que.isEmpty()){

            temp = que.remove();
            if(que.isEmpty()) break;

            if(temp == null && !que.isEmpty()){

                System.out.println();
                System.out.print("level " + level+1);
                que.add(null);
                if(maxSum<currentSum) {
                    maxSum = currentSum;
                    maxLevel = level;
                }
                currentSum = 0;
                level++;
            }else{
                System.out.print("  " + temp.data);
                currentSum = currentSum + temp.data;
                if(temp.left != null) que.add(temp.left);
                if(temp.right != null) que.add(temp.right);
            }

        }
        if(maxSum<currentSum) {
            maxSum = currentSum;
            maxLevel = level;
        }
        System.out.println();
        System.out.println("max Sum is " + maxSum + " and max level is " + maxLevel);
    }


    public static void main(String args[]){

        BinaryTree obj = new BinaryTree();
        MaxSumLevel obj1 = new MaxSumLevel();
        BinaryTree root = null;

        root = obj.insert(root,5);
        root = obj.insert(root,8);
        root = obj.insert(root,3);
        root = obj.insert(root,4);
        root = obj.insert(root,2);
        root = obj.insert(root,6);
        root = obj.insert(root,9);

        obj1.maxLevel(root);
    }

}
