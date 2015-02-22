package Practice.src.HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 31/1/15.
 */
public class PickCandies {

    public static  int lastPickUp = 0;
    public  static int lastPos = 0;
    public static int  calculate(int array[],int no){

        int pos = 0;
        int result = 0 ;
        if(lastPickUp < no ){
           pos = lastPos;
        }

        for(int i=pos;i<array.length;i++){
            if(array[i] >= no){
                result = i;
                break;
            }
        }
        lastPos = result;
        lastPickUp = no;
        return  result+1;
    }

    public static void add(int array[]){

        for(int i=1 ;i< array.length;i++){
            array[i] = array[i] + array[i-1];
        }
    }

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int arr[] = new int[length];

        for(int i=0;i<length;i++){
            arr[i] = scanner.nextInt();
        }
        add(arr);
        int testCase =  scanner.nextInt();

        for(int i=0;i<testCase;i++ ){
            System.out.println(calculate(arr, scanner.nextInt()));
        }
        scanner.close();
    }
}
