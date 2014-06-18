package HackerEarth;

import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by saurav on 18/6/14.
 */
public class MaxXor {

    static int maxXor(int l, int r) {

        BitSet bits1 = new BitSet();
        BitSet bits2 = new BitSet();
        try{

            bits1.set(Integer.valueOf(new Integer(l).toString(), 2));
            bits2.set(Integer.valueOf(new Integer(r).toString(),2));

            bits1.set(0,bits1.length()+1);
            bits2.set(0,bits2.length()+1);
            bits1.or(bits2);
        }catch (NumberFormatException ex){}
        return convert(bits1);
    }

    public static int convert(BitSet bits) {
        int value = 0;
        for (int i = 0; i < bits.length(); ++i) {
            value += bits.get(i) ? (1 << i) : 0;
        }
        return value;
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
