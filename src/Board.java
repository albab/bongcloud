//Most of the game logic, tracking pieces, determining move validity, etc.

public class Board {
	
	Piece[][] board;
		
	public Board(){
		//Half a chess board
		board = new Piece[4][8];
		initializeBoard();		
	}
		
	public void initializeBoard(){
		//init the board
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 8; j++){
				board[i][j] = null;
			}
		}

		//Place white pieces on the board
		board[0][1] = new Pawn(false);
		board[1][1] = new Pawn(false);
		board[2][1] = new Pawn(false);
		board[3][1] = new Pawn(false);
		
		board[0][0] = new Rook(false);
		board[1][0] = new Knight(false);
		board[2][0] = new King(false);
		board[3][0] = new Bishop(false);
		
		//Place black pieces on the board
		board[0][6] = new Pawn(true);
		board[1][6] = new Pawn(true);
		board[2][6] = new Pawn(true);
		board[3][6] = new Pawn(true);
		
		board[0][7] = new Bishop(true);
		board[1][7] = new King(true);
		board[2][7] = new Knight(true);
		board[3][7] = new Rook(true);

	}


}
