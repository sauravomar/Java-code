package Tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by saurav on 2/7/14.
 */
public class PrintingVerticalOrder {

    public static void  insertInMap(BinaryTree root,int level, Map<Integer,HashSet<Integer>>valueMap){

        if(root == null) return;

        if(valueMap.get(level) == null){
            HashSet<Integer>set = new HashSet<Integer>();
            valueMap.put(level,set);
        }
        HashSet<Integer>set = valueMap.get(level);
        set.add(root.data);
        insertInMap(root.left, level-1, valueMap);
        insertInMap(root.right, level+1, valueMap);
    }

    public static void print(Map<Integer,HashSet<Integer>>valueMap){

        for(Map.Entry<Integer,HashSet<Integer>> entry: valueMap.entrySet()){
            System.out.print("level " + entry.getKey());
            for(Integer i : entry.getValue()){
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        BinaryTree obj = new BinaryTree();
        BinaryTree root = null;
        PrintingVerticalOrder object = new PrintingVerticalOrder();

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
        Map<Integer,HashSet<Integer>>map = new HashMap<Integer, HashSet<Integer>>();
        object.insertInMap(root,0,map);
        System.out.println();
        System.out.println("vertival order");
        object.print(map);
    }


}
