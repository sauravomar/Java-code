package HackerEarth;

import sun.launcher.resources.launcher_es;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by saurav on 20/6/14.
 */
public class AngryChildren {

    public static void main(String[] args) {
        int  N,K;
        int min,j,i;

        Scanner in = new Scanner(System.in);
         N = in.nextInt();
         K = in.nextInt();

         int A[] = new int [N];

         for(int l = 0; l < N ; l++){
            A[l] = in.nextInt();
        }
        Arrays.sort(A);

        j=K; i=0;
        min=A[j-1]-A[i];
        for(;i<N-K;i++,j++)
        {
            if(min>A[j]-A[i+1])
            {
                min=A[j]-A[i+1];
            }
        }
        System.out.println(min);
    }

}
