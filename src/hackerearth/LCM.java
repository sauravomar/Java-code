package hackerearth;

import java.util.Scanner;

public class LCM {
	
	public static  void  calculate(long arr[], int option, int val1, int val2){
		if(option == 1){
			arr[val1-1] = val2;
		}else if(option == 2){
			System.out.println(lcm(arr,val1,val2));
		}
	}
	
	
	private static long lcm(long[] input, int start, int end){
	    long result = input[start-1];
	    for(int i = start-1; i < end; i++) {
	    	result = lcm(result, input[i]);
	    }
	    return result;
	}
	
	private static long lcm(long a, long b){
	    return a * (b / gcd(a, b));
	}
	
	private static long gcd(long a, long b){
	    while (b > 0)
	    {
	        long temp = b;
	        b = a % b; // % is remainder
	        a = temp;
	    }
	    return a;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		long arr[] = new long[testCase];
		
		for(int i=0;i<testCase;i++){
			arr[i] = scanner.nextLong();
		}
		
		testCase = scanner.nextInt();
		
		for(int i=0;i<testCase;i++){
			int opn = scanner.nextInt();
			int val1 = scanner.nextInt();
			int val2 = scanner.nextInt();
			calculate(arr,opn,val1,val2);
		}
	}
	
}
