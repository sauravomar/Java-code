package com.ril.slot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OptimiseRoute {

	List<List<Integer>> optimalUtilization(int maxTravelDist, List<List<Integer>> forwardRouteList,
			List<List<Integer>> returnRouteList) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();

//		sort(returnRouteList);
//		sort(forwardRouteList);
		
		int diff = Integer.MAX_VALUE;
		
		for(int i=0; i<forwardRouteList.size(); i++) {
			for(int j=0; j<returnRouteList.size(); j++) {
				
				int distance = forwardRouteList.get(i).get(1) + returnRouteList.get(j).get(1);
				
				if(maxTravelDist >= distance) {
					if(maxTravelDist- distance < diff) {
						diff = maxTravelDist- distance;
						ArrayList<Integer> list = new ArrayList<Integer>();
						list.add(forwardRouteList.get(i).get(0));
						list.add(returnRouteList.get(j).get(0));
						result =  new ArrayList<List<Integer>>();
						result.add(list);
					}else if(maxTravelDist- distance == diff){
						ArrayList<Integer> list = new ArrayList<Integer>();
						list.add(forwardRouteList.get(i).get(0));
						list.add(returnRouteList.get(j).get(0));
						result.add(list);
					}
				}
			}
		}
		
		return result;

	}

	public void sort(List<List<Integer>> dataSet) {

		Collections.sort(dataSet, new Comparator<List<Integer>>() {
			@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
				return o1.get(1).compareTo(o2.get(1));
			}
		});
	}

	
	public static void main(String[] args) {
		OptimiseRoute route = new OptimiseRoute();
		int maxDist = 20;
		
		List<List<Integer>> forward = new ArrayList<List<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(8);
		forward.add(list);
		
		list = new ArrayList<Integer>();
		list.add(2);
		list.add(15);
		forward.add(list);
		
		list = new ArrayList<Integer>();
		list.add(3);
		list.add(9);
		forward.add(list);
		
		
		List<List<Integer>> backward = new ArrayList<List<Integer>>();
		list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(8);
		backward.add(list);
		
		list = new ArrayList<Integer>();
		list.add(2);
		list.add(11);
		backward.add(list);
		
		list = new ArrayList<Integer>();
		list.add(3);
		list.add(12);
		backward.add(list);
		
		
		route.optimalUtilization(maxDist, forward, backward);
		
		
		
	}
}
