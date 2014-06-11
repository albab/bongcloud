import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Random;

public class BongCloud {
	
	public static Board gameboard;
	public static String currentLocation = null;
	public static String newLocation = null;
	public static boolean whiteTurn = true;
	public static int blackTally, whiteTally;
	
	public static void main(String[] args) {
		System.out.println("\n\nbongcloud\n\n");
		
		blackTally = 0;
		whiteTally = 0;
		
		//init game
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
			
		initializeGame();
		drawBoard();
		
		//Main game loop
		while (true){
			//Read the player's move
		     input = null;
		    
		     try {
		    	 
		    	 if (whiteTurn){
				System.out.println("W:" + whiteTally + " B:" + blackTally);		
		    			System.out.println("White's turn:");	
		    	 } else {
				System.out.println("W:" + whiteTally + " B:" + blackTally);
		    		 System.out.println("Black's turn:");
		    	 }

	
			input = br.readLine();
			parseInput(input);
	
		    	drawBoard();
		    
		    	 
		     } catch (IOException e) {
		    	 System.out.println("Try again.");
		     }       
		}
		
		//EXIT
	}
	
	public static void initializeGame(){
		gameboard = new Board();
	}

	public static void drawBoard(){
		String[][] result = new String[4][8];
		
		//Checker the titles
		boolean white = true;
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 8; j++){
				if (white){
					result[i][j] = "  |";
					white = false;
				}else{
					result[i][j] = "##|";
					white = true;
				}
			}
			white = !(white);
		}	
		
		//Place pieces
		for (int y = 0; y < 8; y++){
			for (int x = 0; x < 4; x++){
				if ( gameboard.board[x][y] != null){
					result[x][y] = gameboard.board[x][y].drawPiece() + "|";
				}
			}
		}
		
		//Print the entire board
		System.out.println("_____________");
		for (int y = 0; y < 8; y++){
			System.out.print("|");
			for (int x = 0; x < 4; x++){
				System.out.print(result[x][y]);
			}
			System.out.print("  " + (8-y));
			System.out.println();
		}
		System.out.println("\'\'\'\'\'\'\'\'\'\'\'\'\'"); 
		System.out.println(" a  b  c  d "); 
	}
	
	
	public static void parseInput(String input) {
		StringTokenizer st = null;
		int count = 0;
		input = input.toLowerCase();
		input = input.trim(); 
		st = new StringTokenizer(input);
		 
	}
}
