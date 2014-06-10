//Knight class

public class Knight extends Piece {

	private int weight;
	
	private String symbol;

	public Knight(boolean w) {
		this.setWhite(w);
		weight = 3;
		symbol = "N";
		
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
		
		if (deltaX == 2 && deltaY == 1){
			return true;
		} else if (deltaX == 1 && deltaY == 2) {
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