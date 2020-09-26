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
	 * Places piece 1 into the puzzle.
	 * 
	 * @param startX The bottom left x index of the piece.
	 * @param startY The bottom left y index of the piece.
	 * @param puzzle The puzzle which the piece is being added to.
	 * @return Returns the puzzle which had a piece added to it.
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
	 * Checks if piece 4A can fit into the puzzle.
	 * 
	 * @param startX The bottom left x index of the piece.
	 * @param startY The bottom left y index of the piece.
	 * @param puzzle The puzzle which has a piece being checked.
	 * @return True if that is a valid location for the piece.
	 */
	public boolean checkPiece4A(int startX, int startY, Puzzle puzzle) {
		int[][] board = puzzle.getBoard();
		boolean valid = true;
		int height = puzzle.getHeight();
		int width = puzzle.getWidth();
		int x = startX;
		int y = startY;
		int leftBoundIndex = x-1;
		int topBoundIndex = y-2;
		int rightBoundIndex = x+1;
		int botBoundIndex = y;
		
		/* Check if the piece can be placed.
		   1st check if the piece will ever go out of bounds. */
		/* The x-axis width */
		valid = checkBounds(leftBoundIndex,rightBoundIndex,width);
		
		/* The y-axis height */
		valid = checkBounds(topBoundIndex,botBoundIndex,height);

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
		
		return valid;
	}
	
	/**
	 * Places piece 4A into the puzzle.
	 * 
	 * @param startX The bottom left x index of the piece.
	 * @param startY The bottom left y index of the piece.
	 * @param puzzle The puzzle which the piece is being added to.
	 * @return Returns the puzzle which had a piece added to it.
	 */
	public Puzzle placePiece4A(int startX, int startY, Puzzle puzzle) {
		Puzzle newPuzzle = puzzle;
		int[][] board = newPuzzle.getBoard();
		boolean valid = true;
		int x = startX;
		int y = startY;

		/* Place the piece. */
		
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


		newPuzzle.setBoard(board);
		return newPuzzle;
	}
	
	/**
	 * Checks if piece 4B can fit into the puzzle.
	 * 
	 * @param startX The bottom left x index of the piece.
	 * @param startY The bottom left y index of the piece.
	 * @param puzzle The puzzle which has a piece being checked.
	 * @return True if that is a valid location for the piece.
	 */
	public boolean checkPiece4B(int startX, int startY, Puzzle puzzle) {
		int[][] board = puzzle.getBoard();
		boolean valid = true;
		int height = puzzle.getHeight();
		int width = puzzle.getWidth();
		int x = startX;
		int y = startY;
		int leftBoundIndex = x;
		int topBoundIndex = y-2;
		int rightBoundIndex = x+2;
		int botBoundIndex = y;
		
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
		
		return valid;
	}
	
	/**
	 * Places piece 4B into the puzzle.
	 * 
	 * @param startX The bottom left x index of the piece.
	 * @param startY The bottom left y index of the piece.
	 * @param puzzle The puzzle which the piece is being added to.
	 * @return Returns the puzzle which had a piece added to it.
	 */
	public Puzzle placePiece4B(int startX, int startY, Puzzle puzzle) {
		Puzzle newPuzzle = puzzle;
		int[][] board = newPuzzle.getBoard();
		boolean valid = true;
		int x = startX;
		int y = startY;

		/* Place the piece. */
		
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
	
	/**
	 * Checks whether a line of cells is within a bounds or not. This can be
	 * used for finding whether the x-axis of cells or the y-axis of cells in
	 * a single line are within the designated boundary. The boundary will go 
	 * from 0 to the limit. 
	 * 
	 * @param lowerBounds The lower bounds of the line of cells being checked.
	 * @param upperBounds The upper bounds of the line of cells being checked.
	 * @param limit The limit to how far the cells can go before being out of bounds.
	 * @return Whether or not the line of cells is in bounds.
	 */
	private boolean checkBounds(int lowerBounds, int upperBounds, int limit) {
		boolean valid = true;
		
		for(int i = lowerBounds; valid && i < upperBounds; i++) {
			if(i < 0 || i >= limit) {
				valid = false;
			}
		}
		
		return valid;
	}
}
