package bordergame;

public class Board {
	private int rows;
	private int columns;
	private Piace[][] piaces;
	
	
	// o construtor s� vai receber quantidade de linhas e colunas
	public Board(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		//Piace ser� estanciado qua a quantidade de linhas e colunas informado
		piaces = new Piace[rows][columns];
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
	
	
	

}
