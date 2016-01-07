package hackerearth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurence {
		
	public static void maxOccur(String str){
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(Character ch : str.toCharArray()){
			int val = 0;
			if(map.containsKey(ch)){
				val = map.get(ch);
			}
			map.put(ch, val+1);
		}
		int max = 0;
		Character ch = null;
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()){
			if(max < entry.getValue()){
				max = entry.getValue();
				ch = entry.getKey();
			}else if(max == entry.getValue() && (int) ch > (int) entry.getKey()){
				ch = entry.getKey();
			}
		}
		System.out.println(ch +" " + max);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		maxOccur( scanner.nextLine());
	}
}
