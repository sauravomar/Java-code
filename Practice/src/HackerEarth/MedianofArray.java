package HackerEarth;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by saurav on 28/6/14.
 */
public class MedianofArray {

    public static void median(int A[]){

        Arrays.sort(A);
        System.out.println(A[(A.length-1)/2]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        median(ar);
    }

}
