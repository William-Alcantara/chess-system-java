package application;

import chess.ChesMatch;

public class Program {

	public static void main(String[] args) {	
		
		
		ChesMatch chessMatch = new ChesMatch();
		UI.printBoard(chessMatch.getPieces());

	}

}
