package HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 17/6/14.
 */
public class UtopianTree {

    public static int calHeight(int N ){
        int height = 1;
        for(int i=1;i<=N;i++){
            if(i%2 == 0) height =  height+1;
            else height = height*2;
        }

        return height;
    }

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int testCase =  scanner.nextInt();
        int season = 0,no=0,height=0;
        int count = 0;
        int arr[] = new int[10];

        if(testCase>=1 && testCase <=10){

            for(int i=0;i<testCase;i++ ){
               no = scanner.nextInt();
               if(no>=0 && no<=60){
                   System.out.println(calHeight(no));
               }
            }

        }
        scanner.close();
    }
}
