package hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class PartiallySorted {
	
	
	public static void sortString(String str[],int noOfChar, int noRet ){
		
		String string []= new String[str.length];
		
		for(int i=0;i<str.length;i++){
			string[i] = str[i].substring(0,noOfChar);
		}
		
		Arrays.sort(str,0,3);
		
		for(String st : str){
			if(st.startsWith(string[noRet-1])){
				System.out.println(st);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		for(int i=0;i<testCase;i++){
			int N = scanner.nextInt();
			int K = scanner.nextInt();
			int M = scanner.nextInt();
			
			String str [] = new String[N];
			for(int j=0;j<N;j++){
				str[j]  = scanner.next();
			}
			sortString(str,M,K);
		}
	}
	
}
