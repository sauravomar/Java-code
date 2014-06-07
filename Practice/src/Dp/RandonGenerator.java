package Dp;

/**
 * Created by saurav on 1/6/14.
 */
public class RandonGenerator {
    static int random=23;
    public static int generate(){
         random  =  (7*random +31)%11;
        return random ;
    }
    public static void main(String args[]){

        System.out.println(generate());
        System.out.println(generate());
        System.out.println(generate());
        System.out.println(generate());

    }
}
