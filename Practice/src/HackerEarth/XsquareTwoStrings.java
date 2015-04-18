package HackerEarth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by saurav on 18/4/15.
 */
public class XsquareTwoStrings {

    public static void isSubs(String s1, String s2){
        Map<Character,Integer> map =  new HashMap<Character,Integer>();
        int length = s1.length();

        for(int i=0; i<s1.length();i++) {
            char ch = s1.charAt(i);
            if(map.containsKey(ch)){
                int val = map.get(ch);
                val = val +1;
                map.put(ch,val);
            }else{
                map.put(ch,1);
            }
        }
        length = s2.length();
        for(int i=0;i<length;i++){
            char ch = s2.charAt(i);
            if(map.containsKey(ch)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for(int i=0;i<testCase;i++){
            String s1 = scanner.next();
            String s2 = scanner.next();
            isSubs(s1,s2);
        }
        scanner.close();
    }
}
