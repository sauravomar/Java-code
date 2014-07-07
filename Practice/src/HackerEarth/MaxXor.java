package HackerEarth;

import java.util.Scanner;

/**
 * Created by saurav on 18/6/14.
 */
public class MaxXor {

    static int maxXor(int L, int R) {
        short max = 0;
        while (L != R){
            L >>= 1;
            R >>= 1;
            max = (short)((max << 1) + 1);
        }
        return max;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());

        int _r;
        _r = Integer.parseInt(in.nextLine());

        res = maxXor(_l, _r);
        System.out.println(res);

    }
}
