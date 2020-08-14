package bordergame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	
	// o construtor só vai receber quantidade de linhas e colunas
	public Board(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		//Piace será estanciado qua a quantidade de linhas e colunas informado
		pieces = new Piece[rows][columns];
	}


	public int getRows() {
		return rows;
	}


	public void setRows(int rows) {
		this.rows = rows;
	}


	public int getColumns() {
		return columns;
	}


	public void setColumns(int columns) {
		this.columns = columns;
	} 
	
	public Piece piece(int rows, int columns) {
		return pieces[rows][columns];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	

}
