package HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 21/6/14.
 */
public class HalloweenParty {

    public static long calculate(long no){
        if(no%2==0){
            return (no/2)*(no/2);
        }else{
            return ((no-1)/2)*((no+1)/2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(calculate(in.nextInt()));
        }
    }
}
