package techgig;

import java.math.BigInteger;
import java.util.Scanner;

public class TrailingZeros {
	
	public static long findTrailingZeros(String no){
		BigInteger n =  new BigInteger(no);
		BigInteger count = BigInteger.ZERO;
	    BigInteger div = n.divide(new BigInteger("1"));
	    
	    for (int i=5; div.compareTo(BigInteger.ONE)>=1; i *= 5){
	    	div = n.divide(new BigInteger(i+""));
	    	count = count.add(div);
	    }
	    return count.longValue();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		
		for(int i=0; i<testCase;i++){
			System.out.println(findTrailingZeros(scanner.next()));
		}
	}
}
