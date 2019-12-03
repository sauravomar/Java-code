package com.ril.slot;

import java.util.ArrayList;
import java.util.List;

public class EvenOddOperations {

	public static long getMaximumScore(List<Integer> integerArray) {
		
		int indexToRemove = -1;
		boolean isOdd = true;
		long sum = 0L;
		
		while (!integerArray.isEmpty()) {
			if (isOdd) {
				sum = sum + getSum(integerArray);
				indexToRemove = indexToRemove(integerArray, true);
				integerArray = getSubList(integerArray, indexToRemove);
			}else {
				sum = sum - getSum(integerArray);;
				indexToRemove = indexToRemove(integerArray, false);
				integerArray = getSubList(integerArray, indexToRemove);
			}
			
			isOdd = !isOdd;
		}

		return sum;

	}

	private static int indexToRemove(List<Integer> integerArray, boolean isOdd) {
		int indexToRemove = 0;
		if (integerArray.get(0) < integerArray.get(integerArray.size() - 1)) {
			indexToRemove = integerArray.size() - 1;
		}
		if (isOdd) {
			return indexToRemove;
		} else {
			return indexToRemove == 0 ? integerArray.size() - 1 : 0;
		}
	}
	
	private static List<Integer> getSubList(List<Integer> integerArray, int indexToRemove){

		if(indexToRemove == 0) {
			integerArray =  integerArray.subList(1, integerArray.size());
		}else {
			integerArray =  integerArray.subList(0, integerArray.size()-1);
		}
		
		return integerArray;
	}
	
	private static long getSum(List<Integer>list) {
		long sum = 0l;

		for (int ele : list) {
			sum = sum + ele;
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(EvenOddOperations.getMaximumScore(list));
	}
}
