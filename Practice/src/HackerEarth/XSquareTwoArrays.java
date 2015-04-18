package HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 18/4/15.
 */
public class XSquareTwoArrays {

    public static int getSum(int query,int []A, int[]B,int start, int end){
        int sum = 0;
        boolean alternate = true;
        int first [], second[];

        if(query == 1){
            first = A;
            second = B;
        }else{
            first = B;
            second = A;
        }

        for(int i=start-1;i<end;i++){
            if(alternate){
                sum = sum + first[i];
                alternate = false;
            }else{
                sum = sum + second[i];
                alternate = true;
            }
        }
        return sum;
    }

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int length1 = scanner.nextInt();
        int testCase = scanner.nextInt();

        int A[] = new int[length1];
        int B[] = new int[length1];

        for(int i=0;i<length1;i++){
            A[i] = scanner.nextInt();
        }

        for(int i=0;i<length1;i++){
            B[i] = scanner.nextInt();
        }

        for(int i =0 ;i<testCase;i++){
            System.out.println(getSum(scanner.nextInt(),A,B,scanner.nextInt(),scanner.nextInt()));
        }

        scanner.close();
    }

}
