package HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 28/7/14.
 */
public class ZeroOneMultiple {

    public static String value = "";

   public static int count_bits(int n) {
        int i = 0;
        while (n > 0) {
            int val = n&1;
            if (val ==1){
                i++;
            }
            n >>= 1;
        }
        return i;
    }

    public static int smallest_greater_same_weight(int n) {
        int i = count_bits(n);
        int m = n;

        for (;;) {
            if (i == count_bits(++m))
                break;
        }

        return m;
    }

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int testCase =  scanner.nextInt();

        System.out.println(smallest_greater_same_weight(testCase));
        System.out.println(value);
        scanner.close();
    }

}
