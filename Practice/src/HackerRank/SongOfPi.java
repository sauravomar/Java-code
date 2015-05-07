package HackerRank;

import java.util.Scanner;

/**
 * Created by saurav on 6/5/15.
 */
public class SongOfPi {

    static String pi = "31415926535897932384626433833";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str[] = new String[n];
        in.nextLine();
        for(int i=0;i<n;i++){
            calculate(in.nextLine());
        }
    }

    public static void calculate(String str){
        StringBuilder sb = new StringBuilder();
        String arr[] = str.split(" ");
        int length = arr.length;
        for(String st : arr){
            sb.append(st.length());
        }
        if(sb.toString().equals(pi.substring(0,sb.toString().length()))){
            System.out.println("It's a pi song.");
        }else{
            System.out.println("It's not a pi song.");
        }
    }

}
