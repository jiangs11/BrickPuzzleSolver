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
	 * Checks if piece 1 can fit into the puzzle.
	 * 
	 * @param startX The bottom left x index of the piece.
	 * @param startY The bottom left y index of the piece.
	 * @param puzzle The puzzle which has a piece being checked.
	 * @return True if that is a valid location for the piece.
	 */
	public boolean checkPiece1(int startX, int startY, Puzzle puzzle) {
		int[][] board = puzzle.getBoard();
		boolean valid = true;
		int height = puzzle.getHeight();
		int width = puzzle.getWidth();
		int x = startX;
		int y = startY;
		int leftBoundIndex = y;
		int topBoundIndex = x;
		int rightBoundIndex = y+5;
		int botBoundIndex = x;
		
		/* Check if the piece can be placed.
		   1st check if the piece will ever go out of bounds. */
		/* The x-axis width */
		valid = checkBounds(leftBoundIndex,rightBoundIndex,width);
		
		/* The y-axis height */
		if(valid) {
			valid = checkBounds(topBoundIndex,botBoundIndex,height);
		}

		/* 2nd check if the locations of the piece are occupied. */
		if(valid) {
			/* Left */
			if((board[x][y] == 0) && 
			/* Left + 1 */
			(board[x][y+1] == 0) &&
			/* Left + 2 */
			(board[x][y+2] == 0) &&
			/* Left + 3 */
			(board[x][y+3] == 0) &&
			/* Left + 4 */
			(board[x][y+4] == 0) &&
			/* Right */
			(board[x][y+5] == 0)) {}
			
			else {
				valid = false;
			}
		}
		return valid;
	}
	
	/**
	 * Places piece 1 into the puzzle.
	 * 
	 * @param startX The bottom left x index of the piece.
	 * @param startY The bottom left y index of the piece.
	 * @param puzzle The puzzle which the piece is being added to.
	 * @return Returns the puzzle which had a piece added to it.
	 */
	public Puzzle placePiece1(int startX, int startY, Puzzle puzzle)
			throws IndexOutOfBoundsException {
		Puzzle newPuzzle = puzzle;
		int[][] board = newPuzzle.getBoard();
		int x = startX;
		int y = startY;

		/* Place the piece. */
		
		/* Left */
		board[x][y] = 1;
		/* Left + 1 */
		board[x][y+1] = 1;
		/* Left + 2 */
		board[x][y+2] = 1;
		/* Left + 3 */
		board[x][y+3] = 1;
		/* Left + 4 */
		board[x][y+4] = 1;
		/* Right */
		board[x][y+5] = 1;


		newPuzzle.setBoard(board);
		return newPuzzle;
	}
	
	/**
	 * Checks if piece 3A can fit into the puzzle.
	 * 
	 * @param startX The bottom left x index of the piece.
	 * @param startY The bottom left y index of the piece.
	 * @param puzzle The puzzle which has a piece being checked.
	 * @return True if that is a valid location for the piece.
	 */
	public boolean checkPiece3A(int startX, int startY, Puzzle puzzle) {
		int[][] board = puzzle.getBoard();
		boolean valid = true;
		int height = puzzle.getHeight();
		int width = puzzle.getWidth();
		int x = startX;
		int y = startY;
		int leftBoundIndex = y;
		int topBoundIndex = x-1;
		int rightBoundIndex = y+3;
		int botBoundIndex = x;
		
		/* Check if the piece can be placed.
		   1st check if the piece will ever go out of bounds. */
		/* The x-axis width */
		valid = checkBounds(leftBoundIndex,rightBoundIndex,width);
		
		/* The y-axis height */
		if(valid) {
			valid = checkBounds(topBoundIndex,botBoundIndex,height);
		}

		/* 2nd check if the locations of the piece are occupied. */
		if(valid) {
			/* Bottom Left */
			if((board[x][y] == 0) && 
			/* Bottom Mid Left */
			(board[x][y+1] == 0) &&
			/* Bottom Mid Right */
			(board[x][y+2] == 0) &&
			/* Bottom Right */
			(board[x][y+3] == 0) &&
			/* Top Left */
			(board[x-1][y+1] == 0) &&
			/* Top Right */
			(board[x-1][y+2] == 0)) {}
			
			else {
				valid = false;
			}
		}
		return valid;
	}
	
	/**
	 * Places piece 3A into the puzzle.
	 * 
	 * @param startX The bottom left x index of the piece.
	 * @param startY The bottom left y index of the piece.
	 * @param puzzle The puzzle which the piece is being added to.
	 * @return Returns the puzzle which had a piece added to it.
	 */
	public Puzzle placePiece3A(int startX, int startY, Puzzle puzzle)
			throws IndexOutOfBoundsException {
		Puzzle newPuzzle = puzzle;
		int[][] board = newPuzzle.getBoard();
		int x = startX;
		int y = startY;

		/* Place the piece. */
		
		/* Bottom Left */
		board[x][y] = 3;
		/* Bottom Mid Left */
		board[x][y+1] = 3;
		/* Bottom Mid Right */
		board[x][y+2] = 3;
		/* Bottom Right */
		board[x][y+3] = 3;
		/* Top Left */
		board[x-1][y+1] = 3;
		/* Top Right */
		board[x-1][y+2] = 3;


		newPuzzle.setBoard(board);
		return newPuzzle;
	}
	
	/**
	 * Checks if piece 3B can fit into the puzzle.
	 * 
	 * @param startX The bottom left x index of the piece.
	 * @param startY The bottom left y index of the piece.
	 * @param puzzle The puzzle which has a piece being checked.
	 * @return True if that is a valid location for the piece.
	 */
	public boolean checkPiece3B(int startX, int startY, Puzzle puzzle) {
		int[][] board = puzzle.getBoard();
		boolean valid = true;
		int height = puzzle.getHeight();
		int width = puzzle.getWidth();
		int x = startX;
		int y = startY;
		int leftBoundIndex = y-1;
		int topBoundIndex = x-1;
		int rightBoundIndex = y+2;
		int botBoundIndex = x;
		
		/* Check if the piece can be placed.
		   1st check if the piece will ever go out of bounds. */
		/* The x-axis width */
		valid = checkBounds(leftBoundIndex,rightBoundIndex,width);
		
		/* The y-axis height */
		if(valid) {
			valid = checkBounds(topBoundIndex,botBoundIndex,height);
		}

		/* 2nd check if the locations of the piece are occupied. */
		if(valid) {
			/* Bottom Left */
			if((board[x][y] == 0) && 
			/* Bottom Right */
			(board[x][y+1] == 0) &&
			/* Top Left */
			(board[x-1][y-1] == 0) &&
			/* Top Mid Left */
			(board[x-1][y] == 0) &&
			/* Top Mid Right */
			(board[x-1][y+1] == 0) &&
			/* Top Right */
			(board[x-1][y+2] == 0)) {}
			
			else {
				valid = false;
			}
		}
		return valid;
	}
	
	/**
	 * Places piece 3B into the puzzle.
	 * 
	 * @param startX The bottom left x index of the piece.
	 * @param startY The bottom left y index of the piece.
	 * @param puzzle The puzzle which the piece is being added to.
	 * @return Returns the puzzle which had a piece added to it.
	 */
	public Puzzle placePiece3B(int startX, int startY, Puzzle puzzle)
			throws IndexOutOfBoundsException {
		Puzzle newPuzzle = puzzle;
		int[][] board = newPuzzle.getBoard();
		int x = startX;
		int y = startY;

		/* Place the piece. */
		
		/* Bottom Left */
		board[x][y] = 3;
		/* Bottom Right */
		board[x][y+1] = 3;
		/* Top Left */
		board[x-1][y-1] = 3;
		/* Top Mid Left */
		board[x-1][y] = 3;
		/* Top Mid Right */
		board[x-1][y+1] = 3;
		/* Top Right */
		board[x-1][y+2] = 3;


		newPuzzle.setBoard(board);
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
		int leftBoundIndex = y-1;
		int topBoundIndex = x-2;
		int rightBoundIndex = y+1;
		int botBoundIndex = x;
		
		/* Check if the piece can be placed.
		   1st check if the piece will ever go out of bounds. */
		/* The x-axis width */
		valid = checkBounds(leftBoundIndex,rightBoundIndex,width);
		
		/* The y-axis height */
		if(valid) {
			valid = checkBounds(topBoundIndex,botBoundIndex,height);
		}

		/* 2nd check if the locations of the piece are occupied. */
		if(valid) {
			/* Bottom Left */
			if((board[x][y] == 0) && 
			/* Bottom Right */
			(board[x][y+1] == 0) &&
			/* Mid Left */
			(board[x-1][y-1] == 0) &&
			/* Mid Right */
			(board[x-1][y] == 0) &&
			/* Top Left */
			(board[x-2][y] == 0) &&
			/* Top Right */
			(board[x-2][y+1] == 0)) {}
			
			else {
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
	public Puzzle placePiece4A(int startX, int startY, Puzzle puzzle)
			throws IndexOutOfBoundsException {
		Puzzle newPuzzle = puzzle;
		int[][] board = newPuzzle.getBoard();
		int x = startX;
		int y = startY;

		/* Place the piece. */
		
		/* Bottom Left */
		board[x][y] = 4;
		/* Bottom Right */
		board[x][y+1] = 4;
		/* Mid Left */
		board[x-1][y-1] = 4;
		/* Mid Right */
		board[x-1][y] = 4;
		/* Top Left */
		board[x-2][y] = 4;
		/* Top Right */
		board[x-2][y+1] = 4;

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
		int leftBoundIndex = y;
		int topBoundIndex = x-2;
		int rightBoundIndex = y+2;
		int botBoundIndex = x;
		
		/* Check if the piece can be placed.
		   1st check if the piece will ever go out of bounds. */
		/* The x-axis width */
		valid = checkBounds(leftBoundIndex,rightBoundIndex,width);
		
		/* The y-axis height */
		if(valid) {
			valid = checkBounds(topBoundIndex,botBoundIndex,height);
		}

		/* 2nd check if the locations of the piece are occupied. */
		if(valid) {
			/* Bottom Left */
			if((board[x][y] == 0) && 
			/* Bottom Right */
			(board[x][y+1] == 0) &&
			/* Mid Left */
			(board[x-1][y+1] == 0) &&
			/* Mid Right */
			(board[x-1][y+2] == 0) &&
			/* Top Left */
			(board[x-2][y] == 0) &&
			/* Top Right */
			(board[x-2][y+1] == 0)) {}
			
			else {
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
	public Puzzle placePiece4B(int startX, int startY, Puzzle puzzle)
			throws IndexOutOfBoundsException {
		Puzzle newPuzzle = puzzle;
		int[][] board = newPuzzle.getBoard();
		int x = startX;
		int y = startY;

		/* Place the piece. */
		
		/* Bottom Left */
		board[x][y] = 4;
		/* Bottom Right */
		board[x][y+1] = 4;
		/* Mid Left */
		board[x-1][y+1] = 4;
		/* Mid Right */
		board[x-1][y+2] = 4;
		/* Top Left */
		board[x-2][y] = 4;
		/* Top Right */
		board[x-2][y+1] = 4;

		newPuzzle.setBoard(board);
		return newPuzzle;
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
		
		for(int i = lowerBounds; valid && i <= upperBounds; i++) {
			if(i < 0 || i >= limit) {
				valid = false;
			}
		}
		
		return valid;
	}
}
