package hackerearth;

import java.util.Scanner;

public class ChocklateGame {
	
	
	public static  void  calculate(long arr[]){
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		long arr[] = new long[testCase];
		
		for(int i=0;i<testCase;i++){
			arr[i] = scanner.nextLong();
		}
		calculate(arr);
	}
}	
