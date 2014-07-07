package Tree;

/**
 * Created by saurav on 2/7/14.
 */
public class SumTree {
     public static int sum=0;
    public static void convert(BinaryTree root){

        if(root == null) return;

        convert(root.right);

        sum =  sum + root.data;

        root.data = sum - root.data;

        convert(root.left);

    }


    public static void main(String args[]){

        BinaryTree obj = new BinaryTree();
        BinaryTree root = null;
        SumTree object = new SumTree();

        root = obj.insert(root,5);
        root = obj.insert(root,8);
        root = obj.insert(root,3);
        root = obj.insert(root,4);
        root = obj.insert(root,2);
        root = obj.insert(root,6);
        root = obj.insert(root,9);

        System.out.println("levlOrder");
        obj.levelOrder(root);
        System.out.println();
        System.out.println("sum tree");

        convert(root);
        obj.levelOrder(root);

    }

}
