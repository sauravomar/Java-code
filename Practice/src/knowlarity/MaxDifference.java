package Practice.src.knowlarity;

import java.util.Scanner;

/**
 * Created by saurav on 17/12/14.
 */
public class MaxDifference {

   public static int maxDiff(int arr[])
    {
        int n =arr.length;
        int diff[] = new int[n-1];
        for (int i=0; i < n-1; i++)
            diff[i] = arr[i+1] - arr[i];

        int max_diff = diff[0];
        for (int i=1; i<n-1; i++)
        {
            if (diff[i-1] > 0)
                diff[i] += diff[i-1];
            if (max_diff < diff[i])
                max_diff = diff[i];
        }
        return max_diff;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input =  "";
        int n = in.nextInt();
        int [] ar = new int[n];

        for(int i=0;i<n;i++){
            ar[i] =in.nextInt();
        }
        System.out.println(maxDiff(ar));
    }
}
