package HackerEarth;

import java.util.*;

/**
 * Created by saurav on 25/6/14.
 */
public class MarkToys {

    public static int maxToys(int prices[],int k ){

        Arrays.sort(prices);

         int count=0,check=0;
         for(int i=0;i<prices.length; i++){
             check = check + prices[i];
             if(k-check>=0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt(),k=stdin.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++) prices[i]=stdin.nextInt();

        int answer = maxToys(prices,k);
        // Compute the final answer from n,k,prices
        System.out.println(answer);
    }

}
