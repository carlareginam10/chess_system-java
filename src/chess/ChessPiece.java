package chess;

import bordergame.Board;
import bordergame.Piece;

public class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	//não quero que a cor de uma peça seja modificada por isso não coloco o set
	/*public void setColor(Color color) {
		this.color = color;
	}*/

	

}
