package com.ril.slot;

import java.util.ArrayList;
import java.util.List;

public class MatrixRotation {
	
	
	static void matrixRotation(List<List<Integer>> matrix, int r) {
		
	}
	
	static void rotate(List<List<Integer>> matrix, int r, int loop) {
		
		List<Integer>temp = new ArrayList<Integer>();
		temp = matrix.get(loop).subList(r,  matrix.get(loop).size());
		
		List<Integer>temp2 = new ArrayList<Integer>();
		temp2 = matrix.get(loop).subList(0,  r);
		
		
		temp.addAll(getColumnsValues(matrix, matrix.get(0).size(), 0, r));
		
		matrix.set(0, temp2);
		
		temp2 = getColumnsValues(matrix, 0, r, matrix.get(0).size());
		
		
		for(int i=0; i<r; i++) {
			matrix.get(i).set(i, matrix.get(i+r).get(i));
		}
		
		for(int i=0; i<r; i++) {
			matrix.get(i).set(i, temp.get(i));
		}
		
		
		
	}
	
	static List<Integer>getColumnsValues(List<List<Integer>> matrix, int col, int start, int end){
		List<Integer>temp = new ArrayList<Integer>();
		for(int i=start; i<end; i++) {
			temp.add(matrix.get(start).get(col));
		}
		return temp;
	}
	
}
