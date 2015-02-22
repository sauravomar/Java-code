//package Tree;
//
///**
// * Created by saurav on 7/6/14.
// */
//public class RootToLeaf {
//
//    public void path(BinaryTree root, int [] path,int pathLength){
//
//        if(root == null) return;
//
//        path[pathLength] = root.data;
//        pathLength++;
//
//        if(root.left == null & root.right == null){
//            printPath(path,pathLength);
//        }
//
//        path(root.left, path, pathLength);
//        path(root.right, path, pathLength);
//
//    }
//
//    public void printPath(int path[], int pathLength){
//        System.out.println("path");
//        for(int i=0;i<pathLength;i++) System.out.println(path[i]);
//    }
//
//    public static void main(String args[]){
//
//        BinaryTree obj = new BinaryTree();
//        RootToLeaf obj1 = new RootToLeaf();
//        BinaryTree root = null;
//
//        root = obj.insert(root,5);
//        root = obj.insert(root,8);
//        root = obj.insert(root,3);
//        root = obj.insert(root,4);
//        root = obj.insert(root,2);
//        root = obj.insert(root,6);
//        root = obj.insert(root,9);
//        int [] path = new int[100];
//        obj1.path(root,path,0);
//    }
//
//}
