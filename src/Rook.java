//Rook class

public class Rook extends Piece {

	private int weight;
	
	private String symbol;

	public Rook(boolean w) {
		this.setWhite(w);
		weight = 5;
		symbol = "R";
		
		if (w == true) {
			this.symbol = "w" + this.symbol;
		} else {
			this.symbol = "b" + this.symbol;
		}
		
		
	}
	
	public boolean canMove(int lastX, int lastY, int currentX, int currentY, boolean isNewSpaceEmpty) {
		int deltaX;
		int deltaY;
		
		deltaX = Math.abs(currentX-lastX);
		deltaY = Math.abs(currentY-lastY);
		
		if (deltaX == 0 && deltaY != 0) {
			return true;
		} else if (deltaX != 0 && deltaY == 0) {
			return true;
		}
		
		return false;	
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