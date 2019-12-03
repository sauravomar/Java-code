package com.ril.grocery.slotManagement.redis.publisher;

import java.util.Arrays;

public class MaxDotProduct {

	static int MaxDotProduct(int A[], int B[], int m, int n) 
	{ 
	    // Create 2D Matrix that stores dot product 
	    // dp[i+1][j+1] stores product considering B[0..i] 
	    // and A[0...j]. Note that since all m > n, we fill 
	    // values in upper diagonal of dp[][] 
	    int dp[][] = new int[n + 1][m + 1]; 
	    for (int[] row : dp) 
	    Arrays.fill(row, 0); 
	  
	    // Traverse through all elements of B[] 
	    for (int i = 1; i <= n; i++) 
	  
	    // Consider all values of A[] with indexes greater 
	    // than or equal to i and compute dp[i][j] 
	    for (int j = i; j <= m; j++) 
	  
	        // Two cases arise 
	        // 1) Include A[j] 
	        // 2) Exclude A[j] (insert 0 in B[]) 
	        dp[i][j] = 
	            Math.max((dp[i - 1][j - 1] +  
	                    (A[j - 1] * B[i - 1])), dp[i][j - 1]); 
	  
	    // return Maximum Dot Product 
	    return dp[n][m]; 
	} 
	
	// Driver code 
	public static void main(String[] args) { 
	    int A[] = {2, 3, 1, 7, 8}; 
	    int B[] = {3, 6, 7}; 
	    int m = A.length; 
	    int n = B.length; 
	    System.out.print(MaxDotProduct(A, B, m, n)); 
	} 
	
}
