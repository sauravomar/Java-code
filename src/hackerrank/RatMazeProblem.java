package com.ril.slot;

public class RatMazeProblem {

	
	boolean isSafe(int maze[][], int x, int y) { 
	    if (x >= 0 && x < maze.length && y >= 0 && y <  maze.length && maze[x][y] == 1) 
	        return true; 
	  
	    return false; 
	}
	
	public boolean solveMaze(int mat[][], int x, int y) {
		
		if (x == mat.length- 1 && y == mat.length - 1) { 
	        return true; 
	    } 
		
		if(isSafe(mat, x+1, y)) {
			return solveMaze(mat, x+1, y);
		}
		
		if(isSafe(mat, x, y+1)) {
			return solveMaze(mat, x, y+1);
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		int maze[][] = { 
				{ 1, 0, 0, 0 }, 
                { 1, 1, 0, 1 }, 
                { 0, 1, 0, 0 }, 
                { 1, 1, 1, 1 } }; 
		
		System.out.println(new RatMazeProblem().solveMaze(maze, 0, 0)) ;
		
	}
}
