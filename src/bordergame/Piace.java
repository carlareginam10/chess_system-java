package bordergame;

public class Piace {
	protected Position position;
	private Board board;
	
	
	//A posi��o de uma pe�a recem criada � null, pois a pe�a ainda n�o foi colocada no tabuleiro
		//por isso n�o tem construtor pra ela		
	public Piace(Board board) {
		this.board = board;
	}

	//somente classes dentro do mesmo pacote e subclasses v�o poder acessar o tabuleiro
	protected Board getBoard() {
		return board;
	}


	
	
	
	

}
