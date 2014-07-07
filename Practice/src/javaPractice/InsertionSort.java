package javaPractice;

import java.util.Scanner;

/**
 * Created by saurav on 21/6/14.
 */
public class InsertionSort {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int A[] = new int[t];

        for(int i = 0; i < t; i++){
            A[i] = in.nextInt();
        }
        sort(A);
    }

    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void sort(int A[]){

        int length = A.length;
        int j=0,no=0;
        for(int i=1;i<length;i++){
            j=i;
            no=A[i];

            while(j>=1 && A[j-1]>no ){
                A[j] = A[j-1];
                j--;
                printArray(A);
            }

            A[j]= no;

        }
        printArray(A);
    }

}
