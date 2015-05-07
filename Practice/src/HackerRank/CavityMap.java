package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by saurav on 7/5/15.
 */
public class CavityMap {

    public static void calculate(String str[]){
        int length = str.length;
        StringBuilder sb = new StringBuilder();
        System.out.println(str[0]);

        for(int i=1;i<length-1;i++ ){

            int length2 =  str[i].length();
            sb.append(str[i].charAt(0)+"");
            for(int j=1;j<length2-1;j++ ){

                String top = ""+str[i-1].charAt(j);
                String bottom = ""+str[i+1].charAt(j);
                String left = ""+str[i].charAt(j-1);
                String right = ""+str[i].charAt(j+1);
                String st = ""+str[i].charAt(j);

                if(top.compareTo(st) < 1 &&  bottom.compareTo(st) < 1 && left.compareTo(st) < 1  && right.compareTo(st) < 1){
                    sb.append("X");
                }else{
                    sb.append(st);
                }
            }
            sb.append(str[i].charAt(length2-1)+"");
            System.out.println(sb.toString());
            sb.setLength(0);
        }
        System.out.println(str[length-1]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str[] = new String[n];

        for(int i=0;i<n;i++){
            str[i] = in.next();
        }
        calculate(str);
    }
}
