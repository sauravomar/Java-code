package HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 24/4/15.
 */
public class RoyAndRop {

    public static int array[][];

    public static int calculateTime(int length){
        int result = length;
        int lower = 0,upper = 0;
        int greater = 0;

        for (int i = 0; i < length-1; i++) {
             lower = array[0][i];
             upper = array[1][i];
             if(lower>upper) greater = lower;
             else greater = upper;
            if(greater> length -(i+1)) result = result + ((length -i+1)-greater);
        }
        return  result;
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        int length =  scanner.nextInt();

        for(int test = 0;test<testCase;test ++) {
            array = new int[length - 1][length - 1];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < (length - 1); j++){
                    array[i][j] = scanner.nextInt();
                }
            }
            System.out.println(calculateTime(length));
        }
    }
}
