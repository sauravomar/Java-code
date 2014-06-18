package javaPractice;

/**
 * Created by saurav on 15/6/14.
 */
public class MaxOnes {

    static int maxOnes(int [][]a, int N ) {

        int max = 0;
        int value = 0;
        for(int i=0;i<N;i++){
             value = noOfOnes(a[i]) ;
            if(max<value){
               max = value;
            }
        }
        return max;
    }

    static int noOfOnes(int a[]){

        int low = 0;
        int high = a.length-1;

        while(low <= high) {
            int middle = (low+high) /2;
            if (1> a[middle]){
                low = middle +1;
            } else if (1< a[middle]){
                high = middle - 1;
            }else {
                if(1 == a[middle]) return (middle+1);

            }
        }
        return 0;
    }
    public static void main(String args[]){
        int[][] a = new int[2][2];
        System.out.println(a.length);
        System.out.println(a[0].length);
        a[1][0] = 1;
        System.out.println(maxOnes(a,a.length));
     }
}
