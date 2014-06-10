//Bishop class

public class Bishop extends Piece {

	private int weight;
	
	private String symbol;

	public Bishop(boolean w) {
		this.setWhite(w);
		weight = 3;
		symbol = "B";
		
		if (w == true) {
			this.symbol = "w" + this.symbol;
		} else {
			this.symbol = "b" + this.symbol;
		}
		
		
	}
	
	
	public boolean canMove(int lastX, int lastY, int currentX, int currentY, boolean isNewSpaceEmpty) {
		int deltaX;
		int deltaY;
		
		deltaX = Math.abs(currentX - lastX);
		deltaY = Math.abs(currentY - lastY);
		
		if (deltaX == deltaY) {
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