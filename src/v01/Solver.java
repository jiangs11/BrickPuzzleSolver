package v01;

/**
 * Solves the brick puzzle. 
 * 
 * @author Joseph Frost
 * @version 2020.09.26
 */
public class Solver {
	
	public Solver() {
		
	}
	
	public Puzzle solve(Puzzle puzzle) {
		Puzzle solved = puzzle;
		int[][] board = solved.getBoard();
		
		
		solved.setBoard(board);
		return solved;
	}
	
	/**
	 * 
	 * 
	 * @param startX
	 * @param startY
	 * @param puzzle
	 * @return
	 */
	private Puzzle placePiece1(int startX, int startY, Puzzle puzzle) {
		Puzzle newPuzzle = puzzle;
		int[][] board = newPuzzle.getBoard();
		boolean valid = true;
		int height = puzzle.getHeight();
		int width = puzzle.getWidth();
		
		/* Check that the starting positions are not null. */
		valid = checkNullStart(startX, startY, puzzle);
		
		/* Check if the piece can be placed. */
		for(int i = startX; i < startX + 6 && valid; i++) {
			/* Check for nulls. */
			if(i >= width) {
				valid = false;
				break;
			}
			/* Check to see if the positions are not blocked. */
			if(board[startY][i] != 0) {
				valid = false;
			}
		}
		
		/* Place the piece. */
		if(valid) {
			for(int i = startX; i < startX + 6; i++) {
				board[startY][i] = 1;
			}
		}

		return newPuzzle;
	}
	
	/**
	 * Checks to see if piece 4A can be 
	 * 
	 * @param startX
	 * @param startY
	 * @param puzzle
	 * @return
	 */
	private Puzzle placePiece4A(int startX, int startY, Puzzle puzzle) {
		Puzzle newPuzzle = puzzle;
		int[][] board = newPuzzle.getBoard();
		boolean valid = true;
		int height = puzzle.getHeight();
		int width = puzzle.getWidth();
		int leftBoundIndex = startX-1;
		int topBoundIndex = startY+2;
		int rightBoundIndex = startX+1;
		int botBoundIndex = startY;
		int x = startX;
		int y = startY;
		
		/* Check if the piece can be placed.
		   1st check if the piece will ever go out of bounds. */
		/* The x-axis width */
		for(int i = leftBoundIndex; valid && i < rightBoundIndex; i++) {
			if(i < 0 || i >= width) {
				valid = false;
			}
		}
		/* The y-axis height */
		for(int i = topBoundIndex; valid && i < botBoundIndex; i++) {
			if(i < 0 || i >= height) {
				valid = false;
			}
		}
		/* 2nd check if the locations of the piece are occupied. */
		if(valid) {
			/* Bottom left */
			if(board[y][x] != 0) {
				valid = false;
			}
			/* Bottom right */
			if(valid && board[y][x+1] != 0) {
				valid = false;
			}
			/* Mid left */
			if(valid && board[y-1][x-1] != 0) {
				valid = false;
			}
			/* Mid right */
			if(valid && board[y-1][x] != 0) {
				valid = false;
			}
			/* Top left */
			if(valid && board[y-2][x] != 0) {
				valid = false;
			}
			/* Top right */
			if(valid && board[y-2][x+1] != 0) {
				valid = false;
			}
		}

		/* If the location of the piece is valid, 
		 * place the piece. */
		if(valid) {
			/* Bottom left */
			board[y][x] = 4;
			/* Bottom right */
			board[y][x+1] = 4;
			/* Mid left */
			board[y-1][x-1] = 4;
			/* Mid right */
			board[y-1][x] = 4;
			/* Top left */
			board[y-2][x] = 4;
			/* Top right */
			board[y-2][x+1] = 4;
		}
		
		newPuzzle.setBoard(board);
		return newPuzzle;
	}

	
	private boolean checkNullStart(int startX, int startY, Puzzle puzzle) {
		boolean valid = true;
		int height = puzzle.getHeight();
		int width = puzzle.getWidth();
		
		/* Check that the starting positions are not null. */
		if((startX < 0 || startY < 0) && 
				(startY >= height ||
						startX >= width)) {
			valid = false;
		}
		
		return valid;
	}
}
