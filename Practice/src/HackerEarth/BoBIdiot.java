package HackerEarth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by saurav on 11/10/14.
 */
public class BoBIdiot {

    public static String convert(String str, Map<String,String>map){

        for(Map.Entry<String ,String > entry :  map.entrySet()){
            if(str.contains(entry.getKey())){
                str = swap(str,entry.getKey(),entry.getValue());
            }
        }
        return str;
    }

    public static  String swap(String str, String key, String value){

        StringBuilder sb = new StringBuilder();
            for(int i=0;i<str.length();i++){
                String ch = ""+str.charAt(i);
                if(ch.equals(key)) {
                    sb.append(value);
                }else if(ch.equals(value)) {
                    sb.append(key);
                }else{
                    sb.append(ch);
                }

            }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String,String> replaceMap = new HashMap<String, String>();
        int n = in.nextInt();

        if( n<1 || n >1000000){
            return;
        }

        for(int i=0;i<n;i++){
            replaceMap.put(in.next(),in.next());
        }
        String str = in.next();

        if(str.length() < 1 || str.length() > 1000000){
            return;
        }

        System.out.println(convert(str, replaceMap));
    }
}
