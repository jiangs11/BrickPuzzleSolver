package v01;

public class Driver {

	public static void main(String[] args) {
		Puzzle puzzle1 = new Puzzle(6,6);
		puzzle1.setBoard(buildPuzzle1(puzzle1.getBoard()));
		//displayPuzzle(puzzle1);
		
		puzzle1 = buildPiece1(3,1, puzzle1);
		displayPuzzle(puzzle1);
	}
	
	/**
	 * Displays the numbers on each position of the puzzle's board.
	 * 
	 * @param puzzle The puzzle being displayed.
	 */
	private static void displayPuzzle(Puzzle puzzle) {
		
		int height = puzzle.getHeight();
		int width = puzzle.getWidth();
		int[][] board = puzzle.getBoard();
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("" + board[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	/**
	 * Builds the first puzzle.
	 * 
	 * @param puzzle The puzzle being built.
	 * @return The board of the puzzle being built.
	 */
	private static int[][] buildPuzzle1(int[][] board) {
		int[][] newBoard = board;
		
		newBoard[0][0] = 9;
		newBoard[0][5] = 9;
		newBoard[2][0] = 9;
		newBoard[2][5] = 9;
		newBoard[4][0] = 9;
		newBoard[4][5] = 9;
		
		return newBoard;
	}
	
	/**
	 * 
	 * 
	 * @param startX
	 * @param startY
	 * @param puzzle
	 * @return
	 */
	private static Puzzle buildPiece1(int startX, int startY, Puzzle puzzle) {
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
	
	private static boolean checkNullStart(int startX, int startY, Puzzle puzzle) {
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












