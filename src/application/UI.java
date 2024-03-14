package application;

import world.xadrez.entities.chess.ChessPiece;

public class UI {
	public static void printBoard(ChessPiece[][] pieces) {
		for (int row = 0; row < pieces.length; row++) {
			System.out.print((8 - row) + " ");
			for (int column = 0; column < pieces.length; column++) {
				printPiece(pieces[row][column]);
			}
			System.out.println();
		}
		System.out.println("  A B C D E F G H");
	}

	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		} else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
