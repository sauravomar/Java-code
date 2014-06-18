package javaPractice;

/**
 * Created by saurav on 15/6/14.
 */
public class IntegerPallindrome {
    static int isIntegerPalindrome(int a) {

        int num = a;
        int rev = 0;
        int dig = 0;
        while (num > 0)
        {
            dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }

        if(a == rev) return 1;
        else return 0;
    }

    public static void main(String args[]){
        System.out.println(isIntegerPalindrome(11));
    }
}
