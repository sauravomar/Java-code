package javaPractice;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by saurav on 7/6/14.
 */


public class PermutationOfString {

    public static Set<String> permute(String str){

        Set<String> perm = new HashSet<String>();
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }

        char first = str.charAt(0);
        String rem =  str.substring(1);
        Set<String> words = permute(rem);

        for(String word : words){
            for(int i=0;i<str.length();i++){
                perm.add(insert(word,first,i));
            }
        }
        return perm;
    }

    public static String insert(String str,char c,int j){

        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;

    }
    public static void main(String args[]){

        String str = "abc";
       Set<String>words =  permute(str);
        for(String word:words){
            System.out.println(word);
        }
    }
}
