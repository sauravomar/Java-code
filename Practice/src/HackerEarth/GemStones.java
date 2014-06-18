package HackerEarth;

import java.util.*;

/**
 * Created by saurav on 18/6/14.
 */
public class GemStones {

    public static  String makeUnique(String str){

        char a[] = str.toCharArray();
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<str.length();i++){
            if(!map.containsKey(a)){
                map.put(a[i],1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : map.keySet()){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void calulate(String str,Map<Character,Integer>map, int testCase){

        char a[] = makeUnique(str).toCharArray();

        for(int i=0;i<a.length;i++){

            if(map.containsKey(a[i])){
                int value = map.get(a[i]);
                map.put(a[i],value+1);
            }else {
                map.put(a[i],1);
            }

        }
    }

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int testCase =  scanner.nextInt();
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        if(testCase>=1 && testCase <=100){

            for(int i=0;i<testCase;i++ ){
                String str = scanner.next();
                if(str.matches("^[a-z]+$")){
                   calulate(str,map,testCase);
                }
            }

        }
        int count = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == testCase){
                count++;
            }
        }
        scanner.close();
        System.out.println(count);
    }


}
