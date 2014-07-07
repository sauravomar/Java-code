package HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 21/6/14.
 */
public class ServiceLane {

    public static int min(int a[],int i,int j ){
        int min = a[i];

        for(int k=i;k<=j;k++){
            if(a[k]<min) min = a[k];
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int testCase = in.nextInt();
        int a[] = new int[len];
        int strt =0;
        int end = 0;
        for(int i = 0; i < len; i++){
            a[i] = in.nextInt();
        }

        for(int i = 0; i < testCase; i++){
            strt = in.nextInt();
            end = in.nextInt();

            System.out.println(min(a,strt,end));

        }
    }

}
