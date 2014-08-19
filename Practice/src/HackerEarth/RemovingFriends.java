package HackerEarth;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by saurav on 30/7/14.
 */


public class RemovingFriends {

    private static int delete(LinkedList<Integer>pop,int noOfDel){

        int deleted = 0;
        int noOfFrnd =  pop.size();
        int check = 0;

        while(check < noOfFrnd-1 && deleted != noOfDel){

            if(pop.get(check) < pop.get(check+1)){
                pop.remove(check);
                noOfFrnd--;
                deleted++;
            }else{
                check++;
            }
        }
        check = 0;

        while(deleted != noOfDel){

            if(pop.get(check) < pop.get(check+1)){
                pop.remove(check);
                noOfFrnd--;
                deleted++;
            }else{
                check++;
            }
            if( deleted != noOfDel && check == 0) pop.remove(--noOfFrnd);

        }

        for(int frnd : pop){
            System.out.print(frnd + " ");
        }

        return deleted;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        int noOfFriends = 0;
        int toDel = 0;
        LinkedList<Integer> popular = new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            noOfFriends =  in.nextInt();
            toDel = in.nextInt();

            for(int j=0;j<noOfFriends;j++ ){
                popular.add(in.nextInt());
            }
            delete(popular, toDel);
            popular.clear();
            System.out.println();
        }
    }

}


