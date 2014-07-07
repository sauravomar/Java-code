package HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 22/6/14.
 */
public class QuickParttion {

    static void partition(int[] numbers) {
        int i=1,j=numbers.length-1;
        int pivot = numbers[0];
        while(i<=j){

            while(pivot>numbers[i]){
                i++;
            }
            while(pivot<numbers[j] ){
                j--;
            }
             if(i<=j){
                 swap(i,j,numbers);
                 i++;
                 j--;
             }
            printArray(numbers)  ;
        }
        swap(0,j,numbers);
        printArray(numbers)  ;
    }

    private static void swap(int i, int j,int []numbers) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        partition(ar);
    }

}
