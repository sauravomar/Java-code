package HackerEarth;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by saurav on 28/6/14.
 */
public class GameOfRotation {

    public static int maxMean(int A[])throws IOException{

        int N = A.length;

        long sum = 0;
        for(int v : A){
            sum += v;
        }
        long curPmean = 0;
        for(int i = 0; i < N; ++i){
            curPmean += ((long)A[i])*(i+1);
        }
        long maxPmean = curPmean;
        for(int i = 1; i < N; ++i){
            curPmean = curPmean - sum + ((long)A[i-1])*N;
            if (curPmean > maxPmean){
                maxPmean = curPmean;
            }
        }
        return (int)maxPmean;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        System.out.println(maxMean(ar));
    }
}

