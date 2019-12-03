package com.ril.slot;

import java.util.LinkedList;
import java.util.Queue;

public class NBinary {

	private void print(int n) {
		
		Queue<String>queue =  new LinkedList<String>(); 
		
		queue.add("1");
		
		while(n-- > 0) {
			String str = queue.peek();
			queue.remove();
			System.out.println(str);
			
			queue.add(str+"0");
			queue.add(str+"1");
		}
		
	}
	
	public static void main(String[] args) {
		new NBinary().print(8);
	}
	
}
