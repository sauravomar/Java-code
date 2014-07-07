package Tree;

/**
 * Created by saurav on 3/7/14.
 */
public class DistBetTwoNode {

    public int  distance(BinaryTree root,int one,int  two){

        if(root == null ) return 0;

         if(root.data == one || root.data == two){
             return 1;
         }
        int left = distance(root.left, one, two);
        int right = distance(root.right, one, two);

        if(left>0 && right>0 ){
            System.out.println(left + right);

            return 0;
        }else if(root.data == one || root.data == two){
            if(left>0){
                System.out.println(left);
            }else{
                System.out.println(right);
            }
        }
        if(left>0) return left+1;
        else if(right>0) return right+1;
        return 0;
    }

    public static void main(String args[]){

        BinaryTree obj = new BinaryTree();
        BinaryTree root = null;
        DistBetTwoNode object = new DistBetTwoNode();

        root = obj.insert(root,10);
        root = obj.insert(root,5);
        root = obj.insert(root,2);
        root = obj.insert(root,1);
        root = obj.insert(root,3);
        root = obj.insert(root,8);
        root = obj.insert(root,6);
        root = obj.insert(root,9);
        root = obj.insert(root,20);
        root = obj.insert(root,15);
        root = obj.insert(root,24);
        root = obj.insert(root,23);
        root = obj.insert(root,25);
        root = obj.insert(root,14);
        root = obj.insert(root,16);

        object.distance(root,5,24);
    }

}
