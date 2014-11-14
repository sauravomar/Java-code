package Arrays;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by saurav on 13/11/14.
 */
public class isImperfectString {

    static int isImperfectString(String input) {
        HashSet<String>set =  new HashSet<String>();
        int duet = 0;
        for(int i=0;i<input.length();i++){
            duet++;
            for(int j=0;j<input.length()-1;j++){
                if(j+duet < input.length()){
                    String str = "" +input.charAt(j) + input.charAt(j+duet);
                    if(set.contains(str)){
                        return  1;
                    }else{
                        set.add(str);
                    }
                }
            }
            set.clear();
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  str = in.next();
        System.out.println(isImperfectString(str));
    }
}
