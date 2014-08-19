package Arrays;

import java.util.HashMap;

/**
 * Created by saurav on 7/7/14.
 */
public class SubArrayGivenSum {
    public static boolean findSum(int a[],int sum){

        int currSum = a[0],start = 0;

        for(int i=1;i<a.length;i++){

            if(currSum == sum){
                System.out.println("found with index between" + start + " to " + i );
            }
            while(start>=0 && currSum >sum) {
                 currSum  =  currSum - a[start++];
            }
            if(currSum == sum){
                System.out.println("found with index between" + start + " to " + (i-1) );
            }
            currSum = currSum + a[i];
        }
        return false;
    }

    public static void main(String args[]){
        int arr[] = {1, 4, 20, 3, 10, 5};
        findSum(arr, 33);
    }
}
