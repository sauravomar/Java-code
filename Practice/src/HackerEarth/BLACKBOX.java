package HackerEarth;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by saurav on 11/10/14.
 */
public class BLACKBOX {

    public static int factorial(int number) {
        BigInteger n = BigInteger.ONE;
        for (int i=1; i<=number; i++) {
            n = n.multiply(BigInteger.valueOf(i));
        }
        return sum(n).intValue();
    }

    public static BigInteger sum(BigInteger val){
        BigInteger sum = BigInteger.ZERO;
        int res = val.compareTo(BigInteger.ONE);
        while(res > 0 ){
            sum = sum.add(val.mod(BigInteger.valueOf(10)));
            val = val.divide(BigInteger.valueOf(10));
            res = val.compareTo(BigInteger.ZERO);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Map<Integer,Integer>map = new HashMap<Integer, Integer>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,6);
        map.put(4,6);
        int n = in.nextInt();

        if( n<1 || n >1000){
            return;
        }

        for(int i=0;i<n;i++){
            int val = in.nextInt();
            if(val>=1 && val<=1000){
                if(map.containsKey(val)){
                    System.out.println(map.get(val));
                }else{
                    int value = factorial(val);
                    map.put(val,value);
                    System.out.println(value);
                }
            }
        }
    }
}
