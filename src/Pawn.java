//Pawn class

public class Pawn extends Piece {

	private int weight;
	
	private String symbol;

	public Pawn(boolean w) {
		this.setWhite(w);
		weight = 1;
		symbol = "P";
		
		if (w == true) {
			this.symbol = "w" + this.symbol;
		} else {
			this.symbol = "b" + this.symbol;
		}
		
		
	}
	
	
	public boolean canMove(int lastX, int lastY, int currentX, int currentY, boolean isNewSpaceEmpty) {
		int deltaX;
		int deltaY;
		boolean legal = false;
		
		if (this.isWhite() == true) { 
			deltaY = -(currentY-lastY);
		} else {
			deltaY = currentY - lastY;
		}
		
		deltaX = Math.abs(currentX-lastX);

		if (deltaY == 1 && deltaX == 0 && isNewSpaceEmpty == true){
			legal = true;
		} else if (deltaX == 1 && deltaY == 1 && isNewSpaceEmpty == false){ 
			legal  = true;
		} else if (this.firstToMove == true && deltaY == 2 && deltaX == 0 && isNewSpaceEmpty == true){
			legal = true;
		
		}
		
		return legal;	
	}
	
	
	public String drawPiece() {
		return this.symbol;
	}
	
	
	public void movePiece() {
	}
	
	
	public int getWeight() {
		return weight;
	}
	
	public String getSymbol() {
		return symbol;
	}

}