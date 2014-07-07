package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by saurav on 30/6/14.
 */
public class ZigZagTraversal {


    public static void zigZag(BinaryTree root){

        if(root == null) return;

        int stack1Select=1;
        Stack<BinaryTree>stack1 = new Stack<BinaryTree>();
        Stack<BinaryTree> stack2 = new Stack<BinaryTree>();
        BinaryTree temp = null;
        stack2.push(root);

        while(!stack2.isEmpty() || !stack1.isEmpty()){

            if(stack1Select ==1){
                while (!stack2.isEmpty()){
                    temp = stack2.pop();
                    System.out.println(temp.data);
                    if(temp.left != null) stack1.push(temp.left);
                    if(temp.right != null) stack1.push(temp.right);

                }
                stack1Select =0;

            }else{
                while (!stack1.isEmpty()){
                    temp = stack1.pop();
                    System.out.println(temp.data);
                    if(temp.right != null) stack2.push(temp.right);
                    if(temp.left != null) stack2.push(temp.left);

                }
                stack1Select =1;
            }
        }
    }
    public static void main(String args[]){

        BinaryTree obj = new BinaryTree();
        BinaryTree root = null;
        ZigZagTraversal object = new ZigZagTraversal();

        root = obj.insert(root,5);
        root = obj.insert(root,8);
        root = obj.insert(root,3);
        root = obj.insert(root,4);
        root = obj.insert(root,2);
        root = obj.insert(root,6);
        root = obj.insert(root,9);

        obj.levelOrder(root);
        System.out.println("zigzag");
        object.zigZag(root);
    }

}
