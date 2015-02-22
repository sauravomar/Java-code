package Practice.src.HackerEarth;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by saurav on 8/2/15.
 */
public class RSum {

    public static Map<Integer,Integer> map = new HashMap<Integer, Integer>();
    public  static  int last = 0;

    public static int getSum(int start,int end){
        int result = 0;

        for(int i=start;i<=end;i++){
            if(map.containsKey(i)){
                result = map.get(i) + result;
            }else {
                factorial(i);
                result = map.get(i) + result;
            }
        }
        return result;
    }

    public static int calculateSum(String no){

        int length = no.length();
        char arr[] = no.toCharArray();

        int sum =0;

        for(int i=0;i<no.length();i++ ){
            int num = Integer.parseInt(""+arr[i]);

            if(num != 0){
                sum = num + sum;
            }
        }
        return  sum;
    }

    public static int sum(int num){
        int result = 0;
        while (num!=0){
            result = num + result;
        }
        return result;
    }

    public static String factorial(int no) {
        BigInteger fact = new BigInteger("1");
        for (int i = last; i <= no; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
            int sum =  calculateSum(fact.toString());
            while (sum > 9){
                sum = sum(sum);
            }
            if(sum == 0){
                map.put(i,1);
            }else {
                map.put(i,sum);
            }
            last = no;
        }
        return fact.toString();
    }

    public static String factorial() {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= 100; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
            int sum =  calculateSum(fact.toString());
            while (sum > 9){
                sum = sum(sum);
            }
            map.put(i,sum);
        }
        return fact.toString();
    }


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int notTestCase = scanner.nextInt();
        //factorial();
        for(int i=0;i<notTestCase;i++ ){
            System.out.println(getSum(scanner.nextInt(),scanner.nextInt()));
        }
        scanner.close();
    }
}
