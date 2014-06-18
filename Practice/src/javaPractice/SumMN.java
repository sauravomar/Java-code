package javaPractice;

/**
 * Created by saurav on 15/6/14.
 */
public class SumMN {
    static int multiplyNumbers(int M, int N){
        if(M>N) return sum(M,N);
        else  return sum(N,M);
    }
    static int sum(int M,int N){
        if(N==0) return 0;
        return M+sum(M,N-1);
    }

    public static void main(String args[]){
        System.out.println(sum(3,2));
    }
}
