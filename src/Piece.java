//Abstract piece for structure of all pieces in game

public abstract class Piece {

	private boolean white = true;
	
	public boolean firstToMove = true;

	public void setWhite(boolean white) {
		this.white = white;
	}
	
	public boolean isWhite() {
		return this.white;
	}
	
	public abstract boolean canMove(int lastX, int lastY, int currentX, int currentY, boolean isNewSpaceEmpty);
	public abstract void movePiece();
	public abstract String drawPiece();
}