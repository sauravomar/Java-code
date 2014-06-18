package javaPractice;

/**
 * Created by saurav on 14/6/14.
 */
import Tree.BinaryTree;

import java.lang.instrument.Instrumentation;

public class ObjectSize {

    private static Instrumentation instrumentation;

    public static void premain(String args, Instrumentation inst) {
        instrumentation = inst;
    }

    public static long getObjectSize(Object o) {
        return instrumentation.getObjectSize(o);
    }

    public static void main(String args[]){
        BinaryTree binaryTree = new BinaryTree();
        System.out.println(ObjectSize.getObjectSize(binaryTree));
    }
}
