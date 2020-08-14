package bordergame;

public class Piece {
	protected Position position;
	private Board board;
	
	
	//A posição de uma peça recem criada é null, pois a peça ainda não foi colocada no tabuleiro
		//por isso não tem construtor pra ela		
	public Piece(Board board) {
		this.board = board;
	}

	//somente classes dentro do mesmo pacote e subclasses vão poder acessar o tabuleiro
	protected Board getBoard() {
		return board;
	}


	
	
	
	

}
