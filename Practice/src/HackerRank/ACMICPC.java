package HackerRank;

import java.util.Scanner;

/**
 * Created by saurav on 8/5/15.
 */
public class ACMICPC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String arr[] = new String[n];

        for(int i=0;i<n;i++) {
            arr[i] = in.next();
        }
        calculate(arr,n,m);
    }

    public static int getMaxTopics(String arr[],int n){
        int max = 0,val=0;
        for(int i=0;i<n;i++) {
            int no = Integer.parseInt(arr[i],2);
            for (int j = i; j < n; j++) {
                 val = no|Integer.parseInt(arr[j],2);
                if (val > max) {
                    max = val;
                }
            }
        }
        return max;
    }

    public static void calculate(String arr[],int n,int m){
        int totalTeam = 0 ;
        int maxTopics = getNoSetBits(getMaxTopics(arr,n));
        int maxValue = 0;

        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);

        }

//        for(int i =0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(arr[j][j] == 1){
//                    maxTopics ++;
//                    break;
//                }
//            }
//        }
        System.out.println(maxTopics);
        System.out.println(totalTeam);

    }
    public static int getNoSetBits(int val){
        int count = 0;
        while(val > 0){
            if( (val & 1) == 1){
                count ++;
            }
           val =  val << 1;
        }
        return count;
    }
}
