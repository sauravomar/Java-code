package Practice.src.HackerEarth;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by saurav on 25/1/15.
 */
public class LexicographicallyKthSmallestCharacter {

    public static char getChar(String s,int start,int end, int no){
        char [] subs = s.substring(start-1,end).toCharArray();
        Arrays.sort(s.substring(start-1,end).toCharArray());
        return subs[no-1];
    }

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int testCase =  scanner.nextInt();
        String str = scanner.next();

        for(int i=0;i<testCase;i++ ){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int pos = scanner.nextInt();

            if(length<end-1 || end < pos || start > 0){
                System.out.println( "Out of range" );
                continue;
            }
            try{
                System.out.println(getChar(str, start, end, pos));
            }catch (Exception ex){
                System.out.println( "Out of range" );
            }
        }
        scanner.close();
    }

}
