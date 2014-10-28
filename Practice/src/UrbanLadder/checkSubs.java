package UrbanLadder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by saurav on 7/9/14.
 */

public class checkSubs {

    public boolean caclulate(String str , String subs){

        int count =  0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else {
                map.put(str.charAt(i), 1);
            }
        }

        for(int i=0;i<subs.length();i++){
            if(map.containsKey(subs.charAt(i))){
                count++;
            }
        }

        if(count >= str.length() && count < subs.length() ){
            return  true;
        }

        return false;

    }

    public static void main(String args[]){

        checkSubs obj = new checkSubs();

        if(args.length != 2){
            System.out.println("Usage classname word1 and word2 ");
        }
        else{
            String word1 = args[0];
            String word2 = args[1];
            obj.caclulate(word1,word2);
        }
        //System.out.println(obj.caclulate("eat","stare"));//true
        //System.out.println(obj.caclulate("eat","peat"));//true
        //System.out.println(obj.caclulate("eat","eaten"));//true
        //System.out.println(obj.caclulate("eat","ate"));//false
        //System.out.println(obj.caclulate("rate","trays"));//false
        //System.out.println(obj.caclulate("beer","breads"));//false
    }
}
