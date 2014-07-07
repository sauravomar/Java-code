package HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 19/6/14.
 */
public class ChockLateFeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }

    private static long Solve(int n, int a, int b){
        long  no = n/a;
        long cont = no;
        long remain = 0;
        while(no>0){
            remain = remain + no%b;
            no =  no/b;

            cont=  cont + no;
        }
        cont = cont + remain/b;
        return cont;
    }
}
