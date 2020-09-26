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
	
<<<<<<< HEAD
	/**
	 * 
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

		/* Check that the starting positions are not null. */
		valid = checkNullStart(startX, startY, puzzle);
		
		/* Check if the piece can be placed. */
		/* Bottom left */
		if(board[startY][startX] != 0) { //check for position blocked
			valid = false;
		}
		/* Bottom right */
		if(valid && (startX+1) >= width) { //check for out of bounds
			valid = false;
		}
		else if(board[startY][startX+1] != 0) { //check for position blocked
			valid = false;
		}
		/* Mid left */
		if(valid && ((startX-1) < 0 || (startY-1) < 0 ) ) { //check for out of bounds
			valid = false;
		}
		else if(board[startY-1][startX-1] != 0) { //check for position blocked
			valid = false;
		}
		/* Mid right */
		if() { //check for out of bounds

		}
		else if() { //check for position blocked

		}
		/* Top left */
		if() { //check for out of bounds

		}
		else if() { //check for position blocked

		}
		/* Top right */
		if() { //check for out of bounds

		}
		else if() { //check for position blocked

		}
		
		/* Place the piece. */
		if(valid) {

		}
		
		newPuzzle.setBoard(board);
		return newPuzzle;
	}
=======
	//piece2A
>>>>>>> branch 'master' of https://github.com/jiangs11/BrickPuzzleSolver.git
	
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
