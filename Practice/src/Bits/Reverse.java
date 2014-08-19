package Bits;

/**
 * Created by saurav on 12/8/14.
 */
public class Reverse {

    public static int reverse(int no){
        int  val = 0;
        int temp = no;
        int count = 0;
        while(no!=0){
            val = val<<1;
           if((temp & 1) == 1 ){
               val = val | 1 ;
            }
            temp = no>>1;
            no = temp;
            count++;
        }
        System.out.println("reversed value is -> " + val);
        return val;
    }

    public static void main(String args[]){
        System.out.println(Reverse.reverse(22));
    }
}
