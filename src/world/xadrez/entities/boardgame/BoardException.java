package world.xadrez.entities.boardgame;

public class BoardException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public BoardException(String message) {
		super(message);
	}

}
