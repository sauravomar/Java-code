package com.ril.slot;

import java.util.Stack;

public class LeftSmallest {

	
	public static void smallest(int arr[]) {
		
		Stack<Integer>stack = new Stack<Integer>();
		
		
	     int i=0;
	     
	     while(i < arr.length) {
	    	 while(!stack.isEmpty() && stack.peek() > arr[i]) {
	    		 stack.pop();
	    	 }
	    	 
	    	 if(!stack.isEmpty() && stack.peek() < arr[i]) System.out.println(stack.peek());
	    	 
	    	 if(stack.isEmpty()) {
	    		 System.out.println("_");
	    	 }
	    	 
	    	 
	    	 
	    	 stack.push(arr[i++]);	
	     }
	}
	
	public static void main(String[] args) {
		int arr[] =  {1, 3, 0, 2, 5};
		LeftSmallest.smallest(arr);
	}
}
