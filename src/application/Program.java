package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		//Position pos = new Position(3,5);
		//System.out.println(pos);
		//Board board = new Board(8, 8);
		Scanner sc =  new Scanner(System.in);		
		ChessMatch chessmatch = new ChessMatch();
		
		while (true) {
		UI.printBoard(chessmatch.getPieces());
		System.out.println();
		System.out.print("Source");
		ChessPosition source = UI.readChessPosition(sc);
		
		System.out.println();
		System.out.print("Target");
		ChessPosition target = UI.readChessPosition(sc);
		
		ChessPiece capturedPiece = chessmatch.performChessMove(source, target);
		
		
		}
		

	}

}
