package HackerEarth;

/**
 * Created by saurav on 17/6/14.
 */
public class SumofMultiplesof3or5 {

    public static void main(String args[]){
        int n,sum=0;
        n = (1000-1)/3;
        sum += 3*n*(n+1);
        n = (1000-1)/5;
        sum += 5*n*(n+1);
        n = (1000-1)/15;
        sum -= 15*n*(n+1);
        System.out.println("sum is " + (sum>>1));
    }

}
