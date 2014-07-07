package HackerEarth;

import java.io.PrintStream;
import java.util.ArrayList;

public class SubSet {

    public static void main(String[] args) {

        int[] members = { 1, 2, 3 };
        int min = 1000000;
        int value =1;
        ArrayList<Integer> set = new ArrayList<Integer>();

        for (int n : members) {
            if (!set.contains(n)) {
                set.add(n);
            }
        }

        ArrayList<ArrayList<Integer>> subSets = getSubsets(set);

        System.out.println("Subsets:");

        for(ArrayList<Integer> list : subSets){

            if(list.size()>1){
                value = list.get(0);
                for(int i=1;i<list.size();i++){
                    value = value & list.get(i);
                }
                if(value<min){
                    min = value;
                }
            }

        }
        System.out.println(min);
    }

    private static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set) {

        ArrayList<ArrayList<Integer>> subsetCollection = new ArrayList<ArrayList<Integer>>();

        if (set.size() == 0) {
            subsetCollection.add(new ArrayList<Integer>());
        } else {
            ArrayList<Integer> reducedSet = new ArrayList<Integer>();

            reducedSet.addAll(set);

            int first = reducedSet.remove(0);
            ArrayList<ArrayList<Integer>> subsets = getSubsets(reducedSet);
            subsetCollection.addAll(subsets);

            subsets = getSubsets(reducedSet);

            for (ArrayList<Integer> subset : subsets) {
                subset.add(0, first);
            }

            subsetCollection.addAll(subsets);
        }

        return subsetCollection;
    }
}