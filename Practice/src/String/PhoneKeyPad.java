package String;

import java.util.HashSet;

/**
 * Created by saurav on 25/8/14.
 */
public class PhoneKeyPad {

    private String [] phone = {"1" ,"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
    private HashSet<String>result = new HashSet<String>();

    public void calculate(int val){
        int value = val;
        int index = 0;
        while(val!=0){
            index = val%10;
            add(phone[index-1]);
            val = val /10;
        }

        for(String st : result){
                System.out.println(st);
        }
    }

    public void add(String str){
        HashSet<String>set = new HashSet<String>();
         for(int i=0;i<str.length();i++){
             if(result.size() != 0){
                 for(String st : result){
                     set.add(st+str.charAt(i));
                 }
             }else{
                set.add(""+str.charAt(i));
             }
        }
        result = set;

    }
    public int reverse(int a) {

        int num = a;
        int rev = 0;
        int dig = 0;
        while (num > 0)
        {
            dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String args[]){
        PhoneKeyPad pad = new PhoneKeyPad();

        pad.calculate(pad.reverse(262966));
    }
}
