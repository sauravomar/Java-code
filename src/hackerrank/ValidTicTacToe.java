package com.ril.slot;

public class ValidTicTacToe {

	private static boolean isWin(char board[], char c) {
		
		int arr[][] = {{0,1,2}, {3,4,5}, {6,7,8}, {0,4,8},{2,4,6}, {0,3,6}, {1,4,7}, {2,5,8}};
		
		for(int i=0 ; i<8; i++) {
			if(board[arr[i][0]] == c &&board[arr[i][1]] == c && board[arr[i][2]] == c) return true;
		}
		
		return false;
	}
	
	public static boolean isValid(char board[]) {
		int countX = 0;
		int countO = 0;
		
		for(int  i=0; i< board.length; i++) {
			if(board[i] == 'X' ) countX++;
			else if(board[i] == 'O')countO++;
		}

		if(countO != countX &&  countX != countO+1) return false;
		
		if(isWin(board, 'O')) {
			if(isWin(board, 'X')) return false;
			return true;
		}
		
		if(isWin(board, 'X') && countX < countO) return false; 
		
		return true;
	}
	
	public static void main(String[] args) { 
        char board[] = {'X', 'O', 'X', 
        		'O', 'O', 'X',
        		'X', 'O', 'X'}; 
  
        if ((isValid(board))) { 
            System.out.println("Given board is valid"); 
        } else { 
            System.out.println("Given board is not valid"); 
        } 
    } 
	
}
