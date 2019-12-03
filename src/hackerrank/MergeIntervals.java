package com.ril.slot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeIntervals {

	public static List<Pairs> mergeIntervals(List<Pairs> pairs) {

		List<Pairs> results = new ArrayList<Pairs>();

		Collections.sort(pairs);
		Pairs last = pairs.get(0);

		for (int i = 1; i < pairs.size(); i++) {
			Pairs curr = pairs.get(i);

			if (last.end >= curr.start) {
				Pairs upd  = null;
				if(last.end > curr.end)upd  = new Pairs(last.start,last.end);
				else upd = new Pairs(last.start,curr.end);
				last = upd;
			} else {
				results.add(last);
				System.out.println(last.toString());
				last = curr;
			}
		}

		if(results.isEmpty())results.add(last);
		return results;

	}
	
	public static void main(String args[]) { 
		List<Pairs> results = new ArrayList<Pairs>();
		results.add(new Pairs(6,8)); 
		results.add(new Pairs(1,9)); 
		results.add(new Pairs(2,4)); 
		results.add(new Pairs(4,7)); 
        System.out.println(mergeIntervals(results)); 
    } 
	

}

class Pairs implements Comparable<Pairs> {
	int start;
	int end;

	@Override
	public int compareTo(Pairs o) {
		return this.start - o.start;
	}

	public Pairs(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}


	@Override
	public String toString() {
		return "Pairs [start=" + start + ", end=" + end + "]";
	}

}
