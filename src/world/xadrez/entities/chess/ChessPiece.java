package world.xadrez.entities.chess;

import world.xadrez.entities.boardgame.Board;
import world.xadrez.entities.boardgame.Piece;

public class ChessPiece extends Piece {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}	
	
}
