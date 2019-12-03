package com.ril.grocery.slotManagement.redis.publisher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@SuppressWarnings("resource")
public class MaximumSubArray {

	public List<Integer> maxArray(List<Integer> list) {

		List<Integer> maxList = new ArrayList<Integer>();
		List<Integer> subList = new ArrayList<Integer>();

		int sum = 0;
		int subSum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			int val = list.get(i);
			if (val >= 0) {
				subList.add(val);
				subSum = subSum + val;
			} else if (val < 0 && sum <= subSum) {
				maxList = subList;
				sum = subSum;
				subSum = 0;
				subList = new ArrayList<Integer>();
			}else {
				subSum = 0;
				subList = new ArrayList<Integer>();
			}
		}

		if(subSum > sum) maxList = subList; 
		return maxList;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		MaximumSubArray obj = new MaximumSubArray();
		
		int testCase = scanner.nextInt();
		for (int i = 0; i < testCase; i++) {
			List<Integer> list = new ArrayList<Integer>();
			int arraySize = scanner.nextInt();

			for (int j = 0; j < arraySize; j++) {
				list.add(scanner.nextInt());
			}
			
			String result = obj.maxArray(list).stream()
                    .map(ele -> String.valueOf(ele))
                    .collect(Collectors.joining(" "));
			
			System.out.println(result);
		}

	}
}
