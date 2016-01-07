package techgig;

public class AiroplaneLanding {
	
	
	public static int landingPosition(int[] input1,String[] input2){
		
		try{
			if(input1.length != 2){
				return -1;
			}
			String arr[][] =  convert(input1[1], input1[0], input2);
			int maxCol = getMaxCol(arr);
			int maxRow = getMaxRow(arr);
			
			if(maxCol >maxRow ){
				return maxRow; 
			}else{
				return maxCol;
			}
		}catch(Exception ex){
			return -1;
		}
		
    }
	
	
	private static String[][] convert(int row, int column ,String [] input) throws Exception{
		String [][] arr =   new String[row][column];
		int count = 0;
		
		int checkRow = 0;
		
		for(String str: input){
			arr[count] = str.split("#");
			checkRow++ ;
			if(column != arr[count].length){
				throw new Exception();
			}
			count++;	
		}
		
		if(checkRow != row){
			throw new Exception();
		}
		return arr;
	}
	
	private static int getMaxRow(String [][] arr){
		int maxCol = 0;
		String emptyRow = "o";
		
		for (int j = 0; j<arr.length; j++){
			int localCol = 0;
		     for (int i = 0; i<arr[0].length; i++){
		    	 if(emptyRow.equalsIgnoreCase(arr[j][i])){
		    		 if(i >0 && emptyRow.equalsIgnoreCase(arr[j][i-1])) {
		    			 localCol ++ ;
		    		 }else{
		    			 localCol = 1;
		    		 }
		    	 }
		    	 if(maxCol < localCol){
			    	 maxCol = localCol;
			     }
		     }
		}
		return maxCol;
		
	}
	
	private static int getMaxCol(String [][] arr){
		int maxCol = 0;
		String emptyRow = "o";
		
		for (int j = 0; j<arr[0].length; j++){
			int localCol = 0;
		     for (int i = 0; i<arr.length; i++){
		    	 if(emptyRow.equalsIgnoreCase(arr[i][j])){
		    		 if(j >0 && emptyRow.equalsIgnoreCase(arr[i][j-1])) {
		    			 localCol ++ ;
		    		 }else{
		    			 localCol = 1;
		    		 }
		    	 }
		    	 if(maxCol < localCol){          
			    	 maxCol = localCol;
			     }
		     }
		}
		return maxCol;
	}
	
	public static void main(String[] args) {
		int inp[] = {6,5};
		String inp2[] = {"x#o#o#o#x#o","x#o#o#o#x#x","x#o#o#o#x#o","x#o#x#o#o#x","o#o#o#o#o#o"};
		System.out.println(landingPosition(inp,inp2));
	}
}


 
