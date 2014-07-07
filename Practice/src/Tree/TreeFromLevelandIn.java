package Tree;

import java.util.Arrays;

/**
 * Created by saurav on 4/7/14.
 */
public class TreeFromLevelandIn{
    public static int levelIndex = 0;

    public int search(int in[],int val,int start,int end){
        for(int i=start;i<end ;i++){
            if(in[i] == val) return i;
        }
        return  -1;
    }

    public int [] getlevelArray(int in[],int level[],int start,int end){
        boolean present = false;
        for(int i = 0;i<level.length;i++){
            int no = level[i];
            for(int j=start;j<end;j++){
                if(in[j] == no) {
                    present = true;
                    break;
                }
            }
            if(!present){
                level[i] = 0;
            }
            present = false;
        }
        return removeNullValue(level);
    }

    public int[] removeNullValue(int array[]){

        int index = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0) {
                array[index++] = array[i];
            }
        }
        int[] copy = new int[index];
        System.arraycopy(array, 0, copy, 0,index);
        return copy;
    }

    public BinaryTree convert(int in[],int level[],int start,int end){

        if(start>=end) return null;

        BinaryTree root = new BinaryTree();
        if(level.length>0){
            int loc = search(in,level[0],start,end);

            if(loc >= 0){
                root.data = level[0];
                int newLevel[] = level.clone();
                root.left = convert(in,getlevelArray(in,level,start,loc),start,loc);
                root.right = convert(in,getlevelArray(in,newLevel,loc+1,end),loc+1,end);
            }
        }


        return root;
    }

    public static void main(String args[]){
        int in[] = {5, 10, 20, 50, 51, 55, 60, 65, 70, 80};
        int  pre[] = {50, 10, 60, 5, 20, 55, 70, 51, 65, 80};
        TreeFromLevelandIn object = new TreeFromLevelandIn();
        BinaryTree root = object.convert(in,pre,0,in.length);
        BinaryTree obj = new BinaryTree();
        obj.levelOrder(root);

    }
}
