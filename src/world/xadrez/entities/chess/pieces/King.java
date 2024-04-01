package world.xadrez.entities.chess.pieces;

import world.xadrez.entities.boardgame.Board;
import world.xadrez.entities.chess.ChessPiece;
import world.xadrez.entities.chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}
}
