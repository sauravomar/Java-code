package javaPractice;

import java.util.*;

/**
 * Created by saurav on 14/6/14.
 */

public class Collections  {

    public static void main(String args[]){
        List list = new ArrayList();
        list.add(1);
        list.add("sas");

        SortedSet<Cloning>clonings = new TreeSet<Cloning>();
        clonings.add(new Cloning(1));
        clonings.add(new Cloning(3));
        clonings.add(new Cloning(2));
        SortedSet sortedSet = new TreeSet();
        sortedSet.add(1);
        sortedSet.add(2);
        sortedSet.add(3);
        sortedSet.add(4);

        System.out.println(list.get(0));
        Set<Integer> set = new LinkedHashSet<Integer>();
        NavigableSet navigableSet = new TreeSet();
        navigableSet.add(1);
        navigableSet.add(2);
//        navigableSet.add("saurav");
        navigableSet.add(3);
        navigableSet.add(4);
        System.out.println(navigableSet.floor(3));
        for(Object object :  navigableSet.descendingSet()){
            System.out.println(object.toString());
        }
        System.out.println(System.getSecurityManager());


        Runtime runtime = Runtime.getRuntime();
        long start, end;
        Object obj;
        runtime.gc();
        start = runtime.freeMemory();
        obj = new Object(); // Or whatever you want to look at
        end =  runtime.freeMemory();
        System.out.println("That took " + (start-end) + " bytes.");
    }

}
