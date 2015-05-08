package HackerRank;

import java.util.Scanner;

/**
 * Created by saurav on 8/5/15.
 */
public class SherlockAndGcd {

    private static void solve(int[] A){
        int N = A.length;
        if (N < 2){
            System.out.println("NO");
            return;
        }
        int curGcd = A[0];
        for(int i = 1; curGcd > 1 && i < N; ++i){
            curGcd = gcd(curGcd, A[i]);
        }
        if(curGcd < 2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

    private static int gcd(int a, int b){
        while (b != 0){
            int c = b;
            b = a % b;
            a = c;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = null;
        for(int i=0;i<n;i++) {
            int size = in.nextInt();
            arr = new int [size];
            for(int j=0;j<size;j++){
                arr[j] = in.nextInt();
            }
            solve(arr);
        }
    }
}
