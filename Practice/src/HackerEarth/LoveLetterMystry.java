package HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 18/6/14.
 */
public class LoveLetterMystry {

    public static int diff(char a, char b){
        if(a>b) return  (int) a - (int) b;
        else return  (int) b - (int) a;
    }
    public static int calulate(String str){

        char a[] = str.toCharArray();
        int count = 0;
        int length = str.length();
        int mid = length/2;
        int mid_1 = mid;

        if(length%2 == 0) mid_1 --;

        for(int i=1;i<=length/2;i++){
            count = count + diff(a[mid-i],a[mid_1+i]);
        }

       return count;
    }
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int testCase =  scanner.nextInt();

        if(testCase>=1 && testCase <=10){

            for(int i=0;i<testCase;i++ ){
               String str = scanner.next();
                if(str.length()>=1 && str.length()<=10000){
                    System.out.println(calulate(str));
                }
            }

        }
        scanner.close();
    }
}
