package HackerRank;

import java.util.Scanner;

/**
 * Created by saurav on 8/5/15.
 */
public class TarunAndBday {


    public static void calculate(long black,long white,long x,long y, long z){

        if(z>=x && z >=y){
            System.out.println( (black*x + white*y ));
        }else {
            if(x>=z && y+z <= x){
                System.out.println((black*(y+z) + white*y));
            }else if(y>=z && x+z <= y){
                System.out.println((black*x + white*(x+z)));
            }else{
                System.out.println( (black*x + white*y ));
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long black=0,white=0,x=0,y=0,z=0;

        for(int i=0;i<n;i++) {
            black = in.nextInt();
            white = in.nextInt();
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();
            calculate(black,white,x,y,z);
        }
    }
}

