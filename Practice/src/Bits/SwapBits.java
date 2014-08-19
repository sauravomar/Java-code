package Bits;

/**
 * Created by saurav on 12/8/14.
 */
public class SwapBits {

    public static int swap(int no ,int i, int j){

        int first = 1<<i;
        int second = 1<<j;

        int firstBit = no & first;
        int secondBit = no & second;

        if(firstBit == 0 && secondBit >= 1 ){
            no = no & (~second);
            no = no | first;
        }else if(firstBit >= 1 && secondBit == 0){
            no = no & (~first);
            no = no | second;
        }
        return  no;
    }

    public  static int swap2(int no ,int i, int j){
        if(((no >> i )& 1) != ((no >> j)& 1)){
            no ^=  (1L<<i) | (1L<<j);
        }
        return no;
    }
    public static void main(String args[]){
        System.out.println(SwapBits.swap(22, 1, 3));
    }
}
