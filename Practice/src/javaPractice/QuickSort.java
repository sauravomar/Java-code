package javaPractice;

import java.util.Random;

/**
 * Created by saurav on 22/6/14.
 */
public class QuickSort {

    private int[] numbers;
    private int number;

    public void sort(int[] values) {
        // check for empty or null array
        if (values ==null || values.length==0){
            return;
        }
        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    public void quicksort(int low,int high){

        int i=low+1,j=high;
        int pivot = numbers[low];
        while(i<=j){

            while(pivot>numbers[i]){
                i++;
            }
            while(pivot<numbers[j]){
               j--;
            }
            if(i<=j){
                swap(i,j);
                i++;
                j--;
            }
        }
        printArray(numbers);
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void swap(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
    public  void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
    public static void main(String args[]){

        QuickSort obj = new QuickSort();
        int numbers[]  = {6, 11, 3 ,17, 15, 18, 11 };

        obj.sort(numbers);
        obj.printArray(obj.numbers);
    }
}
