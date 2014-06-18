package javaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * Created by saurav on 15/6/14.
 */
public class SumInArray {

    static int isSumPossible(Vector<Integer> a , int N) {

        if(a.size() == 0  ) return 0;
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i : a){
            map.put(i,1);
        }
        if(map.get(N) != null && map.get(N)==1){
            return 1;
        }else{
            for(int i : a){
                if (map.get(N-i)!=null&& map.get(N-i) == 1){
                    return 1;
                }

            }
        }

        return 0;
    }

    public static void main(String args[]){

        Vector<Integer>a = new Vector<Integer>();

        a.add(10);
        a.add(11);
        a.add(18);
        a.add(21);
        a.add(28);
        a.add(31);
        a.add(38);
        a.add(40);
        a.add(55);
        a.add(60);
        a.add(62);
        System.out.println(isSumPossible(a,66));
    }
}
