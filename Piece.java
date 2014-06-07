//Parent class for each chess piece

public class Piece {

	private boolean black;

	private String position;
	
	public void setupPosition(String position) {
		this.position = position;
	}
	
	public void setWhite(boolean white) {
		this.white = white;
	}
	
	public String getPosition() {
		return position;
	}
	
	public boolean isBlack() {
		return black;
	}


}