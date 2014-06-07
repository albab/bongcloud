//Parent class for each chess piece

public class Piece {

	private boolean black;

	private String position;
	
	protected int weight;
	
	public void setupPosition(String position) {
		this.position = position;
	}
	
	public void setBlack(boolean black) {
		this.black = black;
	}
	
	public String getPosition() {
		return position;
	}
	
	public boolean isBlack() {
		return black;
	}


}