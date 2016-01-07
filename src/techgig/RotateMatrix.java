package techgig;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RotateMatrix {
	
	
	public static String operations_seq(int input1, String[] input2,String[] input3){
		
		try{
			
			if(input2 == null || input3 == null ){
				return "invalid";
			}
			
			String first[][] = convert(input1,input2);
			String second[][] = convert(input1,input3);
			
			System.out.println();
			
			if(first.length != second.length || first[0].length !=  second[0].length){
				return "invalid";
			}

			Map<String,Integer>firstMap = toMap(first);
			Map<String,Integer>secondMap = toMap(second);
			
			if(isEqual(firstMap, secondMap)){
				return "yes";
			}
			return "no";
			
		}catch(Exception ex){
			return "invalid";
		}
		
    }
	
	
	private static String[][] convert(int size, String [] input) throws Exception{
		String [][] arr =   new String[size][size];
		int count = 0;
		
		int checkSize = 0;
		
		for(String str: input){
			arr[count++] = str.split("#");
			checkSize++ ;
		}
		
		if(checkSize != size){
			throw new Exception();
		}
		
		return arr;
	}
	
	private static boolean isEqual(Map<String,Integer>first , Map<String,Integer>second){
		
		for(Map.Entry<String,Integer>entry : first.entrySet() ){
			String ele = entry.getKey();
			int count = entry.getValue();
			
			if(second.containsKey(ele)  &&  second.get(ele) == count ){
				continue;
			}else{
				return false;
			}
		}
		return true;
	}
	
	private  static Map<String,Integer> toMap(String [][] input){
		Map<String,Integer>map = new HashMap<String, Integer>();
		int no = 1;
		for (int j = 0; j<input[0].length; j++){
		     for (int i = 0; i<input.length; i++){
		    	 String ele = input[j][i];
		    	 
		    	 if(map.containsKey(ele)){
		    		 no = map.get(ele) + 1;
		    	 }
		    	 map.put(ele, no);
		    	 no = 1;
		     }
		}
		return map;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		String first[] = {"33#44#11","3#13#12","21#26#21"};
//		String second[] = {"11#3#44","12#26#13","21#33#21"};
		
		String first[] = {"1#1","2#2"};
		String second[] = {"1#1"};
		
		System.out.println(operations_seq(2, first,second));
		check.toMap(first);
	}
	
}

abstract class check{
	public  static Map<String,Integer> toMap(String[] first){
		Map<String,Integer>map = new HashMap<String, Integer>();
		int no = 1;
//		for (int j = 0; j<first[0].length; j++){
//		     for (int i = 0; i<first.length; i++){
//		    	 String ele = first[j][i];
//		    	 
//		    	 if(map.containsKey(ele)){
//		    		 no = map.get(ele) + 1;
//		    	 }
//		    	 map.put(ele, no);
//		    	 no = 1;
//		     }
//		}
		return map;
	}
}
