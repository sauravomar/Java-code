package com.ril.slot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CoveringCloud {
	
	static long maximumPeople(long[] town, long[] location, long[] cloudsLocation, long[] range) {
		
		long totalPopulation  = 0;
		int cloudCanBeRemove = 1;
		
		HashMap<Long, List<Long>> map = new HashMap<Long, List<Long>>();
		
		//sort clouds location;
		map = new HashMap<Long, List<Long>>();
		
		
		for(int i=0 ; i < town.length; i++) {
			List<Long>list = new ArrayList<Long>();
			if(map.containsKey(town[i])) {
				list = map.get(town[i]);
			}
			list.add(location[i]);
			map.put(town[i], list);
		}
		
		Arrays.sort(town);

		for(int i=0 ; i < town.length ; i++) {
			
			List<Long>list =  map.get(town[i]);
			location[i] = list.get(0);
			
			if(list.size() > 1) {
				list = list.subList(1, list.size());
			}
			map.put(town[i], list);
		}
		
		//persist rangeMap
		
		
		for(int i=town.length -1; i>=0; i--) {
			
			boolean isOverLap = isOverlapped(location[i], cloudsLocation, range);
			
			if(isOverLap && cloudCanBeRemove >0) {
				cloudCanBeRemove --;
				totalPopulation = totalPopulation+ town[i];
			}else if(!isOverLap){
				totalPopulation = totalPopulation+ town[i];
			}
		}
		return totalPopulation;
	}
	
	
	private static boolean isOverlapped(long val, long cloud[], long range[]) {
		boolean isOverlap =  false;
		for(int i=0 ; i< cloud.length; i++) {
			long postive = range[i] + cloud[i];
			long negative = cloud[i] - range[i];
			if(postive >= val && val >= negative ) {
				return true;
			}
		}
		
		
		return isOverlap;
		
	}
	
	public static void main(String[] args) {
		long town[] = {9,9,1,5,8};
		long location[] = {1,7,7,11,7};
		long cloud[] = {2,3};
		long range[] = {4,11};
		
		System.out.println(CoveringCloud.maximumPeople(town, location, cloud, range));
	}
	
	
	

}
