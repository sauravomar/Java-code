package HackerEarth;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by saurav on 28/6/14.
 */
public class Anagram {

    public static void check(String A[]){

        int length = 0;
        for(int i=0;i<A.length;i++){
            length = A[i].length();
            if(length%2 ==  1){
                System.out.println(-1);
                continue;
            }else{
                noOfFlip(A[i].substring(0,length/2),A[i].substring(length/2));
            }
        }
    }

    public static void noOfFlip(String a,String b){

        HashMap<Character,Integer> map =  new HashMap<Character, Integer>();

        for(char c : a.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }

        }
        int count =0;
        for(char c : b.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }else{
                map.put(c,1);
            }

        }

        for(Character key : map.keySet()){

            if(map.get(key)!=0 ){
                count = count +  Math.abs(map.get(key));
            }
        }

        System.out.println(count);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] ar = new String[n];
        for(int i=0;i<n;i++){
            ar[i]=in.next();
        }
        check(ar);
    }

}
