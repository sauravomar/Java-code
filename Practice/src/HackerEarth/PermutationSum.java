package Practice.src.HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 7/2/15.
 */
public class PermutationSum {

    public  static int calulateSum(int no){
        if(no == 1) return 1;
        return (int) (Math.floor(Math.pow(no, 2)/2)) -1;
    }


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int notTestCase = scanner.nextInt();

        for(int i=0;i<notTestCase;i++ ){
            System.out.println(calulateSum(scanner.nextInt()));
        }
        scanner.close();
    }
}
