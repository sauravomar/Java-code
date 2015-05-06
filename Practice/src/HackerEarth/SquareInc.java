package HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 21/4/15.
 */
public class SquareInc {

    public static int array[];

    public static void convertIntoSumArray(){
        int length = array.length;
        for(int i =1;i<length;i++){
            array[i] = array[i-1] + array[i];
        }
    }

    public static int binarySearch(int key) {

        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == array[mid]) {
                return mid+1;
            }
            else if (key <= array[mid] && mid > 0 && mid < end && key <= array[mid-1]) {
                end = mid - 1;
            }else if(key >= array[mid] &&  mid > 0 && mid < end && key >= array[mid-1]) {
                start = mid + 1;
            }else if(array[end] > key && array[mid] < key){
                return end +1;
            }else{
                return mid+1;
            }
        }
        return -1;
    }

    public static int getPos(int query){
        int length = array.length;
        for(int i=0;i<length;i++){
            if(array[i]>=query) return i+1;
        }
        return -1;
    }


    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        array = new int [testCase];

        for (int i = 0; i < testCase; i++) {
            array[i] = scanner.nextInt();
        }
        convertIntoSumArray();
        int query = scanner.nextInt();

        for (int i = 0; i < query; i++) {
            System.out.println(binarySearch(scanner.nextInt()));
        }
        scanner.close();
    }
}
