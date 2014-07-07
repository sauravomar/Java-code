package HackerEarth;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonelyInteger {
    static int lonelyinteger(int[] a) {

        HashMap<Integer,Integer>map = new HashMap<Integer, Integer>();

        for(int no : a ){
            if(map.containsKey(no)){
                map.put(no,-1);
            }else{
                map.put(no,1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(!entry.getValue().equals(-1)){
                return entry.getKey();
            }
        }

        return 0;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        res = lonelyinteger(_a);
        System.out.println(res);

    }
}
