package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by saurav on 7/6/14.
 */

public class OddAndEvenLevelSumDiff {

    public void diff(BinaryTree root){

        BinaryTree temp = root;
        Queue<BinaryTree> que =  new LinkedList<BinaryTree>();
        que.add(temp);
        que.add(null);
        int level = 1,currentSum=0, oddSum = 0,evenSum = 0;

        System.out.print("level " + level + " data ");

        while (!que.isEmpty()){

            temp = que.remove();
            if(que.isEmpty()) break;

            if(temp == null && !que.isEmpty()){

                System.out.println();
                System.out.print("level " + (level+1) + " data ");
                que.add(null);
                if(level%2 == 0) evenSum = evenSum+currentSum;
                else if(level%2 == 1) oddSum = oddSum+currentSum;
                level++;
                currentSum = 0;
            }else{
                System.out.print("  " + temp.data);
                currentSum = currentSum + temp.data;
                if(temp.left != null) que.add(temp.left);
                if(temp.right != null) que.add(temp.right);
            }

        }

        if(level%2 == 0) evenSum = evenSum+currentSum;
        else if(level%2 == 1) oddSum = oddSum+currentSum;

        System.out.println();
        System.out.println("diff " + (oddSum - evenSum));
    }


    public static void main(String args[]){

        BinaryTree obj = new BinaryTree();
        OddAndEvenLevelSumDiff obj1 = new OddAndEvenLevelSumDiff();
        BinaryTree root = null;

        root = obj.insert(root,5);
        root = obj.insert(root,8);
        root = obj.insert(root,3);
        root = obj.insert(root,4);
        root = obj.insert(root,2);
        root = obj.insert(root,6);
        root = obj.insert(root,9);

        obj1.diff(root);
    }



}
