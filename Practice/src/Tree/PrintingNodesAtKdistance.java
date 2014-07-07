package Tree;

import java.util.ArrayList;

/**
 * Created by saurav on 3/7/14.
 */
public class PrintingNodesAtKdistance {

    private ArrayList<BinaryTree> parent ;

    PrintingNodesAtKdistance(int noOfNode){
        parent = new ArrayList<BinaryTree>();
    }

   public void print(BinaryTree root,int k,int dis,int data){

        if(parent.size() == 0){
           getParentList(root,data);
        }

       if(root == null) return;
       if(k==dis) System.out.println(root.data);

        if(root.data == data){
            print(root.left, k+1,dis,data);
            print(root.right, k+1,dis,data);
        }


        if(parent.contains(root)){
            BinaryTree temp = null;
            int index = parent.indexOf(root);
            if(parent.size()>1 && index > 0 && index < parent.size()){
                temp = parent.get(index-1);
                if(temp.left == parent.get(index)){
                    print(root.left, k-1,dis,data);
                    print(root.right, k+1,dis,data);
                }else{
                    print(root.left, k+1,dis,data);
                    print(root.right, k-1,dis,data);
                }
            }else {
                if(root.left.data == data){
                    print(root.left, k-1, dis,data);
                    print(root.right, k+1, dis,data);
                }else{
                    print(root.left, k+1, dis,data);
                    print(root.right, k-1, dis,data);
                }

            }
        }else {
            print(root.left,k+1,dis,data);
            print(root.right,k+1,dis,data);

        }

   }

   public int  getParentList(BinaryTree root,int data){

       if(root == null) return 0;

       if(root.data == data) {
           return 1;
       }

       if(getParentList(root.left, data) == 1 || getParentList(root.right, data)  == 1 ){
         parent.add(root) ;
         return 1;
       }
       return 0;
   }

   public static void main(String args[]){

        BinaryTree obj = new BinaryTree();
        BinaryTree root = null;
        PrintingNodesAtKdistance object = new PrintingNodesAtKdistance(20);

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

        obj.levelOrder(root);
        object.getParentList(root,5);
        System.out.println();
        object.print(root,object.parent.size(),2,5);
   }

}

