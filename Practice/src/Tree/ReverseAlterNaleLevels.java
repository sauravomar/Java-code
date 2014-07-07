package Tree;


import java.util.ArrayList;

/**
 * Created by saurav on 30/6/14.
 */
public class ReverseAlterNaleLevels {

    public static void reverse(BinaryTree root){

        if(root == null) return;

        int stack1Select=1;

        ArrayList<BinaryTree> one = new ArrayList<BinaryTree>();
        ArrayList <BinaryTree>two = new ArrayList<BinaryTree>();

        BinaryTree temp = null;
        one.add(root);
        two.add(root.left);
        two.add(root.right);
        int count = 0;

        while(!one.isEmpty() || !two.isEmpty()){

            if(stack1Select ==1){

                stack1Select =0;

                int length = two.size();
                if(count%2==1){
                    for(int i=0;i<one.size();i++){
                        temp =  one.get(i);
                        if(temp!=null ){
                            temp.right = two.get(--length);
                            temp.left = two.get(--length);
                        }
                    }
                }else{
                    for(int i=0;i<one.size();i++){
                        temp =  one.get(i);
                        if(temp!=null ){
                            temp.left = two.get(--length);
                            temp.right = two.get(--length);
                        }
                    }
                }


            }else{
                    one.clear();
                    one = (ArrayList<BinaryTree>)two.clone();
                    two.clear();

                    for(int i=0;i<one.size();i++){
                        if(one.get(i)!= null){
                            if(one.get(i).left!=null) two.add(one.get(i).left);
                            else two.add(null);
                            if(one.get(i).right!=null) two.add(one.get(i).right);
                            else two.add(null);
                        }
                    }
                stack1Select =1;
                count++;
            }
        }

    }
    public static void main(String args[]){

        BinaryTree obj = new BinaryTree();
        BinaryTree root = null;
        ReverseAlterNaleLevels object = new ReverseAlterNaleLevels();

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
        System.out.println("alternate");
        object.reverse(root);
        System.out.println("levelorder");
        obj.levelOrder(root);
    }

}
