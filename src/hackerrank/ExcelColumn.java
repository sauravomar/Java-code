package com.ril.slot;

public class ExcelColumn {

	private String getExcelCol(int val) {
		StringBuilder sb=  new StringBuilder();
		while(val > 0) {
			int rem = val % 26;
			
			if(rem == 0) {
				sb.append('Z');
				val = val/26 -1; 
			}else {
				sb.append((char)((rem - 1) + 'A'));
				val = val/26;
			}
		}
		
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new ExcelColumn().getExcelCol(26));
	}
	
}
