package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by saurav on 7/5/15.
 */
public class AngryProfessor {

    public static void calculate(ArrayList<Integer>arr,int K){
        int count = 0;
        for(Integer val : arr){
            if(val <= 0){
                count++;
            }
        }
        if(count  >K){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer>list = new ArrayList<Integer>();
        int N=0,K=0;
        for(int i=0;i<n;i++){
            N = in.nextInt();
            K = in.nextInt();
            for(int j=0;j<N;j++){
                list.add(in.nextInt());
            }
            calculate(list,K);
            list.clear();
        }
    }
}
