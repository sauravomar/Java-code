package HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 28/6/14.
 */
public class RunningTimeofQuickSort {


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
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    public  int swapOfinsertion;
    public  int quickSwap;
    {
        swapOfinsertion=0;
        quickSwap=0;
    }

    public  void insertionSort(int A[]){

        int length = A.length;
        if(length==0 || length<0){
            return;
        }
        int j=0,no=0;
        for(int i=1;i<length;i++){
            j=i;
            no=A[i];

            while(j>=1 && A[j-1]>no ){
                A[j] = A[j-1];
                j--;
                swapOfinsertion++;
            }

            A[j]= no;

        }

    }
    private void swap(int i, int j) {

        this.quickSwap++;

        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        RunningTimeofQuickSort obj =  new RunningTimeofQuickSort();
        int n = in.nextInt();
        int[] ar = new int[n];

        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        int [] ar2 = ar.clone();
        obj.insertionSort(ar);
        obj.sort(ar2);

        System.out.println(obj.swapOfinsertion-obj.quickSwap);
    }

}
