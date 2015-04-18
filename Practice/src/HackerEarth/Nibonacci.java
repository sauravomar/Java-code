package Practice.src.HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 28/3/15.
 */
public class Nibonacci {
    public static int arr[] = new int[100001];

    public static void  calculate(){
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2;i<=100000;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
    }

    public static  int  getNo(int no){
        int result =  0;

        if(no == 0 || no ==1){
            return no;
        }

        if(no == 2){
            return 1;
        }

        for(int i = 3;i<=no;i++ ){
            if(!isPowerOfTwo(i)){
               return i;
            }
        }

        return result;
    }

    static boolean  isPowerOfTwo (int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        calculate();
        for(int i=0;i<testCase;i++){
            System.out.println(getNo(scanner.nextInt()+3));
        }
        scanner.close();
    }
}
