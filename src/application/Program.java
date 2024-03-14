package application;

import world.xadrez.entities.chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		ChessMatch match = new ChessMatch();
		
		UI.printBoard(match.getPieces());
	}

}
