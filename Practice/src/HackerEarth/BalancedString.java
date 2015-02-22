package Practice.src.HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 22/2/15.
 */
public class BalancedString {

    public static int calculate(String str){
        int result = -1;
        int count = 0;
        int len = str.length();

        for(int i=0;i<len;i++){
            int temp = 1<<str.charAt(i) -'a';
            int res = temp & count;

            if( res > 0){
                count = count & (~temp);
            }else{
                count = count | temp;
            }
        }

         if(count == 0){
             return 1;
         }else{
             return -1;
         }
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int notTestCase = scanner.nextInt();
        //factorial();
        for(int i=0;i<notTestCase;i++ ){
            System.out.println(calculate(scanner.next()));
        }
        scanner.close();
    }
}
