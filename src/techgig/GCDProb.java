package techgig;

import java.util.Scanner;

public class GCDProb {
	
	 
	 public static int[]  coins_value(int[] input1){
		 if(input1 == null || input1.length == 0){
			 return new int[]{0,0};
		 }
		 
		 int a = input1 [0];
		 int b = input1 [1];
		 
		 if(a < 0 || b <0){
			 return new int[]{0,0};
		 }
		 
        int x = 0, y = 1, lastx = 1, lasty = 0, temp;
        int[] result =  new int[2];
        while (b != 0)
        {
        	int q = a / b;
        	int r = a % b;
 
            a = b;
            b = r;
 
            temp = x;
            x = lastx - q * x;
            lastx = temp;
 
            temp = y;
            y = lasty - q * y;
            lasty = temp;            
        }
        result[0] = lastx;
        result[1] = lasty;
        return result;
	} 
	 
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println(coins_value(new int[]{15,25}));
	}
	 
	public static int gcd(int a, int b){
	  
		while(a!=0 && b!=0) {
	     int c = b;
	     b = a%b;
	     a = c;
	  }
	  return a+b; 
	}
}
