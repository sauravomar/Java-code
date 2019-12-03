package com.ril.slot;

import java.util.Stack;

public class LargestHistogramArea {

	static long largestRectangle(int[] h) {

		long maxArea = 0;
		long area = 0;

		Stack<Integer> stack = new Stack<Integer>();

		stack.push(0);
		int i = 1;

		while (i < h.length) {

			if (stack.isEmpty() || h[i] > h[stack.peek()]) {
				stack.push(i++);
				continue;
			} else {
				int top = stack.pop();
				area = 0;
				area = h[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);

				if (area > maxArea)
					maxArea = area;

			}
		}

		while (!stack.isEmpty()) {
			int top = stack.pop();
			area = h[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);

			if (area > maxArea)
				maxArea = area;
		}
		return maxArea;

	}

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(LargestHistogramArea.largestRectangle(arr));
	}
}
