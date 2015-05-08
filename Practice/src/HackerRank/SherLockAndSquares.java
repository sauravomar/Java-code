package HackerRank;

import java.util.Scanner;

/**
 * Created by saurav on 8/5/15.
 */
public class SherLockAndSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = null;
        int small =0,large = 0;
        for(int i=0;i<n;i++) {
            small = in.nextInt();
            large = in.nextInt();
            System.out.println((int)(Math.floor(Math.sqrt(large)) - Math.ceil(Math.sqrt(small)) + 1));
        }
    }
}
