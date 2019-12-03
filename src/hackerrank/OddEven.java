package com.ril.slot;

import java.util.Stack;

public class OddEven {

//	public int solution(String S) {
//		
//		if(S.length() == 0) return 0;
//		
//		int count = 0;
//
//		int no = binaryToDecimal(S);
//
//		while (no > 0) {
//
//			if (no % 2 == 0)
//				no = no / 2;
//			else
//				no = no - 1;
//			count++;
//		}
//		return count;
//
//	}

	private int binaryToDecimal(String n) {
		String num = n;
		int dec_value = 0;
		int base = 1;

		int len = num.length();
		for (int i = len - 1; i >= 0; i--) {
			if (num.charAt(i) == '1')
				dec_value += base;
			base = base * 2;
		}

		return dec_value;
	}

	public static void main(String[] args) {
		System.out.println(new OddEven().solution(" "));
	}

	public int solution(String S) {

		if (S.length() == 0 || S.trim().length() == 0 || ! S.contains(" "))
			return -1;
		Stack<Integer> stack = new Stack<Integer>();
		int one = 0;
		int two = 0;
		String[] operation = S.split(" ");

		try {

			for (int i = 0; i < operation.length; i++) {

				switch (operation[i]) {
				case "POP":
					if (!stack.isEmpty())
						stack.pop();
					else
						throw new Exception("In valid Operation");
					break;
				case "DUP":
					if (!stack.isEmpty())
						stack.push(stack.peek());
					else
						throw new Exception("In valid Operation");
					break;
				case "+":
					if (stack.size() < 2)
						throw new Exception("In valid Operation");
					 one = stack.pop();
					 two = stack.pop();
					stack.push(one + two);
					break;
				case "-":
					if (stack.size() < 2)
						throw new Exception("In valid Operation");
					 one = stack.pop();
					 two = stack.pop();
					stack.push(one - two);
					break;

				default:
					stack.push(Integer.parseInt(operation[i]));
					break;

				}
			}
		} catch (Exception e) {
			return -1;
		}

		if (!stack.isEmpty())
			return stack.peek();
		else
			return -1;

	}

}
