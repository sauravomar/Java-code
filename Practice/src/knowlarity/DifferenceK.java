package Practice.src.knowlarity;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by saurav on 17/12/14.
 */
public class DifferenceK {

    public static void getNo(Set<Integer>set,int k){
        int count = 0;

        for(int no : set){
            if(set.contains(no-k)){
                count++;
            }
        }
        System.out.println(count);
    }



    public static void main(String[] args) {
        Set<Integer>set = new HashSet<Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String[] ar = new String[n];
        for(int i=0;i<n;i++){
            set.add(in.nextInt());
        }
        getNo(set,k);
    }
}
