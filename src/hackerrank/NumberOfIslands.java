package com.ril.grocery.slotManagement.redis.publisher;

public class NumberOfIslands {

	boolean isValid(int mat[][], int row, int col) {
		
		return row>=0 && col>=0 && row < mat.length && col < mat[0].length && mat[row][col] == 1;
	}
	
	public void dfs(int mat[][], boolean visited[][], int row, int col) {

		visited[row][col] = true;

		int rowArr[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int colArr[] = { -1, 0, 1, -1, 1, -1, 0, 1 };
		
		for(int i =0;i< 8;i++) {
			if(isValid(mat, row+rowArr[i], col+colArr[i]) && !visited[row+rowArr[i]][col+colArr[i]]) {
				dfs(mat, visited, row+rowArr[i], col+colArr[i]);
			}
		}

	}

	public int noOdfIslands(int mat[][]) {

		boolean visited[][] = new boolean[mat.length][mat[0].length];
		int count = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {

				if (mat[i][j] == 1 && !visited[i][j]) {
					dfs(mat, visited, i, j);
					count++;
						
				}
			}
		}

		return count;
	}
	
	public static void main(String[] args) {
		 int mat[][] = new int[][] { { 1, 1, 0, 0, 0 }, 
             { 0, 1, 0, 0, 1 }, 
             { 1, 0, 0, 1, 1 }, 
             { 0, 0, 0, 0, 0 }, 
             { 1, 0, 1, 0, 1 } }; 
             
             System.out.println(new NumberOfIslands().noOdfIslands(mat));
	}

}
