package NaryTree;

import java.util.ArrayList;

/**
 * Created by manish on 2/9/14.
 */

public class NaryTree {

    int data;
    ArrayList<NaryTree>childs = new ArrayList<NaryTree>(); // taking maximum 10 nodes

    NaryTree(int data){
        this.data = data;
    }

    public void levelOrder(NaryTree root, int level,int data){
        if(root == null){
            return ;
        }

        if(root.data == data){
            System.out.println("level is  -> " + level);
            return;
        }
        level++;
        for(NaryTree child : root.childs){

            if(child.data == data){
                System.out.println("level is  -> " + level);
                return;
            }
            levelOrder(child,level,data);
        }
    }

    public static void main(String args []){

        NaryTree root = new NaryTree(1);
        root.data =1;

        for(int i=1 ; i<=3;i++){
           root.childs.add(new NaryTree(i+1));
        }
        int count = 5;
        for(int i=1 ; i<=3;i++){
            for(int j=1;j<=3;j++){
                NaryTree ch = root.childs.get(i-1);
                ch.childs.add(new NaryTree(count++));
            }

        }

        root.levelOrder(root,0,1);

    }
}
