package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by saurav on 6/5/15.
 */
public class LongestPallinDromeFromChar {

    public static int PalindromeLengthPuzzle(String[] input1) {
        StringBuilder sb = new StringBuilder();
        for(int  i=0;i<input1.length;i++){
            sb.append(input1[i].charAt(0));
        }
        return longestPalindrome2(sb.toString());
    }

    public static int max (int x, int y) { return (x > y)? x : y; }

    public static int  longestPalindrome2(String str) {

            int n = str.length();
            int i, j, cl;
            int L[][] = new int[n][n];

            for (i = 0; i < n; i++)
                L[i][i] = 1;

            for (cl=2; cl<=n; cl++)
            {
                for (i=0; i<n-cl+1; i++)
                {
                    j = i+cl-1;
                    if (str.charAt(i) == str.charAt(j) && cl == 2)
                        L[i][j] = 2;
                    else if (str.charAt(i) ==  str.charAt(j))
                        L[i][j] = L[i+1][j-1] + 2;
                    else
                        L[i][j] = max(L[i][j-1], L[i+1][j]);
                }
            }
            return L[0][n-1];
    }

    public static void main(String[] args) {
        String[] ar = {"Bharati","Bharat","Akash","Bhavya","Chand","Brijesh","Chetan","Arvind","Bhavana"};
        System.out.println(PalindromeLengthPuzzle(ar));

    }
}
