package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by saurav on 7/6/14.
 */
public class BinaryTree {

    int data;
    BinaryTree left;
    BinaryTree right;

   public  BinaryTree(int data){

        this.data = data;
        this.left = null;
        this.right =  null;

    }
    public BinaryTree(){}

    public BinaryTree insert(BinaryTree root, int data){

        if(root == null) {
            root =  new BinaryTree(data);
            return  root;
        }

        if( root.data > data ) root.left = insert(root.left,data);
        else if( root.data < data ) root.right = insert(root.right,data);

        return  root;
    }

    public void display(BinaryTree root){

        if(root != null) {
            if(root.left != null) display(root.left);
            System.out.println("data " + root.data);
            if(root.right != null) display(root.right);
        }
    }

    public void iterativeInOrder(BinaryTree root){

        if(root ==  null) return;

        BinaryTree temp =  root;
        Stack<BinaryTree>stack = new Stack<BinaryTree>();

        stack.push(temp);

        while(!stack.isEmpty()){

            while(temp!= null && temp.left != null){
                stack.push(temp.left);
                temp =  temp.left;
            }

            temp = stack.pop();
            System.out.println(temp.data);
            temp = temp.right;
            if(temp != null) stack.push(temp);

        }
    }

    public void iterativePreOrder(BinaryTree root){

        if(root ==  null) return;

        BinaryTree temp =  root;
        Stack<BinaryTree>stack = new Stack<BinaryTree>();

        stack.push(temp);
        System.out.println(temp.data);

        while(!stack.isEmpty()){

            while(temp!= null && temp.left != null){
                System.out.println(temp.left.data);
                stack.push(temp.left);
                temp =  temp.left;
            }

            temp = stack.pop();
            temp = temp.right;
            if(temp != null) {
                System.out.println(temp.data);
                stack.push(temp);
            }

        }
    }

    public void iterativePostOrder(BinaryTree root){

        if(root ==  null) return;

        BinaryTree temp =  root;
        Stack<BinaryTree>stack = new Stack<BinaryTree>();


        while(true){
            if(temp != null){
                stack.push(temp);
                temp =  temp.left;
            }
            else{
                if(stack.isEmpty()) {
                    System.out.println("stack is empty");
                    break;
                }
                if(stack.peek().right == null){

                    temp = stack.pop();
                    System.out.println(temp.data);

                    while(!stack.isEmpty() && temp == stack.peek().right){
                        System.out.println(stack.peek().data);
                        temp = stack.pop();
                    }
                }
                if(!stack.isEmpty()){
                    temp = stack.peek().right;
                }else{
                    temp = null;
                }
            }
        }
    }

    public void levelOrder(BinaryTree root){

        BinaryTree temp = root;
        Queue<BinaryTree>que =  new LinkedList<BinaryTree>();
        que.add(temp);
        que.add(null);
        int level = 1;
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
                System.out.print("  " + temp.data);
                if(temp.left != null) que.add(temp.left);
                if(temp.right != null) que.add(temp.right);
            }

        }

    }


    public static void main(String args[]){

        BinaryTree obj = new BinaryTree();
        BinaryTree root = null;

        root = obj.insert(root,5);
        root = obj.insert(root,8);
        root = obj.insert(root,3);
        root = obj.insert(root,4);
        root = obj.insert(root,2);
        root = obj.insert(root,6);
        root = obj.insert(root,9);

        obj.display(root);
        obj.iterativeInOrder(root);
        System.out.println("preorder");
        obj.iterativePreOrder(root);
        System.out.println("postorder");
        obj.iterativePostOrder(root);
        System.out.println("levlOrder");
        obj.levelOrder(root);
    }

}
