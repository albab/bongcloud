//King class

public class King extends Piece {

	private int weight;
	
	private String symbol;

	public King(boolean w) {
		this.setWhite(w);
		weight = 10;
		symbol = "K";
		
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
		
		if (deltaX == deltaY && deltaX == 1 && deltaY == 1) {
			return true;
		} else if (deltaX == 0 && deltaY == 1) {
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
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