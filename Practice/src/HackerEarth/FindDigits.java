package HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 9/7/14.
 */
public class FindDigits {

    public static void find(int no){

        int number = no ;
        int count = 0;
        int value = 1;
        while(number>0){
            value = number%10;

            if(value != 0 && no%value == 0){
                count++;
            }
            number = number /10;
        }
        System.out.println(count);
    }
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();

        for(int i=0;i<testCase;i++){
            find(in.nextInt());
        }
    }


}
