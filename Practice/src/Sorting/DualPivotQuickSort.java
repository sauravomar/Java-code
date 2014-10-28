package Sorting;

/**
 * Created by saurav on 26/10/14.
 */
public class DualPivotQuickSort {

    private void sort(int [] input, int lowIndex, int highIndex){

        if(lowIndex > highIndex) return;

        int pivot1 = input[lowIndex];
        int pivot2 = 0;

        /**
         *  check if  user enter same size as input size
         */

        if(highIndex > input.length) pivot2 = input[input.length-1];
        else pivot2 = input[highIndex];

        /**
         *  check if  both pivot elements are same
         */

        if(pivot1 == pivot2) {
            while(pivot1 == pivot2 && lowIndex < highIndex){
                lowIndex ++;
                pivot1 = input[lowIndex];
            }
        }

        /**
         *  pivot1 should be less than pivot2
         */

        if(pivot1 > pivot2){
            swap(input,lowIndex,highIndex);
            pivot1 = input[lowIndex];
            pivot2 = input[highIndex];
        }

        int i  = lowIndex+1;
        int lt = lowIndex+1;
        int gt = highIndex-1;

        while (i<=gt){
            if(pivot1 > input[i]){
                swap(input,i++,lt++);
            }else if(pivot2 < input[i]){
                swap(input,i,gt--);
            }else{
                i++;
            }
        }

        swap(input,lowIndex,--lt);
        swap(input,highIndex,++gt);

        sort(input, lowIndex, lt-1);
        sort (input, lt+1, gt-1);
        sort(input, gt+1, highIndex);

    }

    public void swap(int [] input, int lowVal, int highVal){

        if(lowVal == highVal || input[lowVal] == input[highVal]) return;

        input[lowVal]  = input[lowVal] ^ input[highVal];
        input[highVal] = input[lowVal] ^ input[highVal];
        input[lowVal]  = input[lowVal] ^ input[highVal];
    }

    public static  void main(String args[]){
        DualPivotQuickSort sort = new DualPivotQuickSort();
        int input [] = {10,7,1,4,6,3,2,9,8};
        sort.sort(input,0,input.length-1);
        System.out.println(input.toString());
    }
}
