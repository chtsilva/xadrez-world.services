package world.xadrez.entities.chess;

import world.xadrez.entities.boardgame.Board;
import world.xadrez.entities.boardgame.Position;
import world.xadrez.entities.chess.pieces.King;
import world.xadrez.entities.chess.pieces.Rook;

public class ChessMatch {
	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

		for (int row = 0; row < board.getRows(); row++) {
			for (int column = 0; column < board.getColumns(); column++) {
				mat[row][column] = (ChessPiece) board.piece(row, column);
			}
		}

		return mat;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.WHITE), new Position(2,1));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
	}
}
