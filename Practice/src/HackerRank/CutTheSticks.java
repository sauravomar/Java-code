package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by saurav on 6/5/15.
 */
public class CutTheSticks {
    public  static ArrayList<Integer>arr = new ArrayList<Integer>();
    public static int getMin(){
        int min = 10000;
        for(int i =0;i<arr.size();i++ ){
            if(min > arr.get(i)) min = arr.get(i);
        }
        return min;
    }

    public static void subtract(){
        int min = getMin();
        ArrayList<Integer>list = new ArrayList<Integer>();
        for(int i=0;i<arr.size();i++){
            list.add(i,arr.get(i) - min);
        }
        arr = list;
    }

    public static void solve(){
        int length = arr.size();
        while (length>0){
            System.out.println(length);
            subtract();
            removeZero();
            length = arr.size();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            arr.add(i,in.nextInt());
        }
        solve();
    }

    public static  void removeZero(){
        int length = arr.size();
        int pos = 0;
        ArrayList<Integer>list = new ArrayList<Integer>();
        for(int i=0;i<length;i++){
            if(arr.get(i) == 0){
              continue;
            }else{
                list.add(pos++,arr.get(i));
            }
        }
        arr = list;
    }
}
