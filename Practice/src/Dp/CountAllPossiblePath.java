package Dp;

/**
 * Created by saurav on 2/6/14.
 */
public class CountAllPossiblePath {

    int path[][];

    CountAllPossiblePath(int m,int n){
        path = new int [m+1] [n+1];
    }

    public int calculate(int m,int n){

        if(m==1 || n ==1 ) return 1;

        if(path[m][n] != 0) return path[m][n];

        return path[m][n] = calculate(m-1,n) + calculate(m,n-1);

    }

    public static void main(String args[]){
        CountAllPossiblePath obj = new CountAllPossiblePath(3,3);
        System.out.println(obj.calculate(3,3));
    }

}

