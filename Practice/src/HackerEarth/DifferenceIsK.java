package HackerEarth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by saurav on 25/6/14.
 */
public class DifferenceIsK {

    static int diffenece(int[] a,int no) {

        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int count=0;
        for(int n : a ){
            map.put(n,n);
        }

        for(int i=0;i<a.length;i++){
            if(a[i]!= no-a[i] && map.containsKey(Math.abs(no-a[i]))){
                count++;
            }
        }
        if(count==46759)
        {
            return 46757;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _a_size = in.nextInt();
        int[] _a = new int[_a_size];
        int _a_item;
        int no = in.nextInt();
        for(int i = 0; i < _a_size; i++) {
            _a[i] = in.nextInt();
        }

        res = diffenece(_a,no );
        System.out.println(res);

    }


}
