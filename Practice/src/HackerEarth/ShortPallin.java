package HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 28/7/14.
 */
public class ShortPallin {

   public static int shortPalin( String s ){
        char S[] =  s.toCharArray();
        int length = S.length;
        int i = length;
        int j = 0;
        int total = 0;

        length--;

        if(length == 1)
            return 0;
        if(length == 2)
        {
            if(S[0]!=S[1])
                return 1;
            return 0;
        }
        i = 0;
        while(i<length/2)
        {
            if(S[i]!=S[length-j-1])
            {
                total++;
                i++;
            }
            else
            {
                j++;
                i++;
            }
        }
        return total;
    }
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        String str =  scanner.nextLine();

        System.out.println(shortPalin(str));
        scanner.close();
    }
}
