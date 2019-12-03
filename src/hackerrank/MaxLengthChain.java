package com.ril.slot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxLengthChain {

	public void lis(List<Pair> pairs) {
		Collections.sort(pairs);
		List<Pair> result = new ArrayList<Pair>();
		result = getPairs(pairs, result, 0);
		result.stream().forEach(action -> System.out.println(action));
	}

	public List<Pair> getPairs(List<Pair> pairs, List<Pair> result, int index) {

		List<Pair> internalResult = new ArrayList<Pair>();
		
		if(index >=pairs.size()) return result;
		
		for (int i = index; i < pairs.size(); i++) {

			if (result.isEmpty() || result.get(result.size() - 1).second < pairs.get(i).first) {
				result.add(pairs.get(i));
				List<Pair>response  = getPairs(pairs, result, i + 1);
				
				
				if(internalResult.size() < response.size()) {
					internalResult = new ArrayList<Pair>();
					internalResult.addAll(response);
				}
				result.remove(result.size() -1);
			}
		}
		return internalResult;
	}

	public static void main(String[] args) {
		List<Pair> pairs = new ArrayList<Pair>();
		pairs.add(new Pair(5, 30));
		pairs.add(new Pair(41, 60));
		pairs.add(new Pair(15, 28));
		pairs.add(new Pair(29, 40));
		pairs.add(new Pair(61, 90));
		new MaxLengthChain().lis(pairs);
	}

}

class Pair implements Comparable<Pair> {
	int first;
	int second;

	Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public int compareTo(Pair o) {
		return this.first - o.first;
	}

	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}

}
