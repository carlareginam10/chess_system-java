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

	//n�o quero que a cor de uma pe�a seja modificada por isso n�o coloco o set
	/*public void setColor(Color color) {
		this.color = color;
	}*/

	

}
