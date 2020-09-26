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
	
	//piece2A
	
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
