public class TicTacToe {
	
	public static final int MAX = 3;
	
	//Returns true if the game array has 3 rows and 3 columns AND 
//each element contains the character 'X', 'O', or '_' (underscore) AND 
//the number of X's equals or is one greater than the number of O's.
//Otherwise returns false.
	public static boolean isValid(char[][] game) {
		int rows = game.length;
		int countX = 0;
		int countO = 0;
		if(rows != MAX) {
			return false;
		} else {
			for(int i=0; i < rows; i++) {
				if(game[i].length != MAX) {
					return false;
				} else {
					for(int j=0;j<game[i].length; j++) {
						if(game[i][j] !='X' && game[i][j] != 'O' && game[i][j] != '_') {
							return false;
						}
						if(game[i][j] =='X') {
							countX++;
						}		
						if(game[i][j] =='O') {
							countO++;
						}
					}
					if(countO <(countX +1) || countO == countX) {
						return true;
					}
				}
			}
			return true;
		}	
	}

// Returns a string representation of a valid game, for example
// O X _
// X _ _
// O X _
// Throws an IllegalArgumentException if the game is NOT valid
// HINT: Call isValid() to find out if the game is valid
	public static String toString(char[][] game) {
		String t = " ";
		if(isValid(game)) {
			for(int i=0; i< game.length; i++) {
				for(int j=0; j< game[i].length; j++) {
					t += (game[i][j] + " ");
				}
				t += ("\n" + " ");
			}
		return t;
		}
		else {
			throw new IllegalArgumentException();
		}
		
	}

// Returns the character 'X' if the player using X to mark the squares has won,
// the character 'O' if the player using O has won, and the character 'N' if 
// neither has won. A player wins by marking all the squares in a row, column,
// or one of the two diagonals. You may assume there is no more than one winner.
// Throws an IllegalArgumentException if the game is NOT valid
// HINT: Call isValid() to find out if the game is valid
	public static char getWinner(char[][] game) {
		if(isValid(game)) {
			if(game[0][0]=='X' && game[0][1]=='X' && game[0][2]=='X') {
				return 'X';
			} else if(game[1][0]=='X' && game[1][1]=='X' && game[1][2]=='X') {
				return 'X';
			} else if(game[2][0]=='X' && game[2][1]=='X' && game[2][2]=='X') {
				return 'X';
			} else if(game[0][0]=='X' && game[1][0]=='X' && game[2][0]=='X') {
				return 'X';
			} else if(game[0][1]=='X' && game[1][1]=='X' && game[2][1]=='X') {
				return 'X';
			} else if(game[0][2]=='X' && game[1][2]=='X' && game[2][2]=='X') {
				return 'X';
			} else if(game[0][0]=='X' && game[1][1]=='X' && game[2][2]=='X') {
				return 'X';
			} else if(game[0][2]=='X' && game[1][1]=='X' && game[2][0]=='X') {
				return 'X';

			} else if(game[0][0]=='O' && game[0][1]=='O' && game[0][2]=='O') {
				return 'O';
			} else if(game[1][0]=='O' && game[1][1]=='O' && game[1][2]=='O') {
				return 'O';
			} else if(game[2][0]=='O' && game[2][1]=='O' && game[2][2]=='O') {
				return 'O';
			} else if(game[0][0]=='O' && game[1][0]=='O' && game[2][0]=='O') {
				return 'O';
			} else if(game[0][1]=='O' && game[1][1]=='O' && game[2][1]=='O') {
				return 'O';
			} else if(game[0][2]=='O' && game[1][2]=='O' && game[2][2]=='O') {
				return 'O';
			} else if(game[0][0]=='O' && game[1][1]=='O' && game[2][2]=='O') {
				return 'O';
			} else if(game[0][2]=='O' && game[0][1]=='O' && game[2][0]=='O') {
				return 'O';
			}
			return 'N';
		} else {
			throw new IllegalArgumentException();
		}
	}
}




	




