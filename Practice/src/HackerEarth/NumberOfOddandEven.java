package Practice.src.HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 25/1/15.
 */
public class NumberOfOddandEven {

    public static int oddArray[];
    public static int evenArray[];
    public static int array[];

    public static int calculate(int evenOdd ,int start, int end){
        if(evenOdd == 1){
            return evenArray[start-1] - evenArray[end-1];
        }else if(evenOdd == 2){
            return oddArray[start-1] - oddArray[end-1];
        }else if(evenOdd == 0){
            preprocessed(start,end);
            return 0;
        }else{
            return 0;
        }
    }

    public static void preprocessed(int start, int end){
        int countEven = 0;
        int countOdd = 0;
        for(int i=start;i<end;i++){
            if(array[i] % 2 == 1){
                countOdd ++;
            }else{
                countEven ++;
            }
            oddArray[i] = countOdd;
            evenArray[i] = countEven;
        }
    }


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        array = new int[length];

        oddArray = new int[length];
        evenArray = new int[length];

        for(int i=0;i<length;i++){
            array[i] = scanner.nextInt();
        }
        preprocessed(0,length);
        int testCase =  scanner.nextInt();

        for(int i=0;i<testCase;i++ ){
            int pos = scanner.nextInt();
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            if(calculate(pos,start,end) !=0){
//                sout
            }

        }
        scanner.close();
    }
}
