package world.xadrez.entities.chess.pieces;

import world.xadrez.entities.boardgame.Board;
import world.xadrez.entities.chess.ChessPiece;
import world.xadrez.entities.chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}
	
}
