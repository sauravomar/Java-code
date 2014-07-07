package HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 19/6/14.
 */
public class FillingJars {


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        long n =  scanner.nextInt();
        long testCase =  scanner.nextInt();
        long avg = 0;
        if(3<=n && n<= 10000000  && 3<=testCase && testCase<= 100000 ){

            long a=0,b=0,value,c=0;
             for(int i=0;i<testCase;i++ ){
                 a =  scanner.nextInt();
                 b =  scanner.nextInt();
                 value =  scanner.nextInt();

                 if(1<=a && a<=b && b<=n && 0<=value && value<=1000000 ){
                     avg=avg+(b-a+1)*value;
                 }

             }

                System.out.println(avg/n);
        }
    }
 }

