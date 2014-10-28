package Sorting;

/**
 * Created by saurav on 31/8/14.
 */
public class Counting {

   public static void sort(int arr []){

       int len = arr.length;
       int count[] =  new int[10];
       int output[] = new int[10];

       for(int i = 0;i<len; ++i)
           ++count[arr[i]];

       for (int i = 1; i <=len; ++i)
           count[i] += count[i-1];

       for (int i = 0;i<len;i++)
       {
           output[count[arr[i]]-1] = arr[i];
           --count[arr[i]];
       }

       for(int val : output){
           System.out.println(val);
       }
   }

   public static void main(String args[]){
       int arr [] = {1, 4, 1, 2, 7, 5, 2};
        Counting.sort(arr);
   }

}
