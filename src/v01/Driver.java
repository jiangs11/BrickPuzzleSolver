package v01;

public class Driver {

	public static void main(String[] args) {
		int height = 6;
		int width = 6;
		
		Puzzle puzzle2 = new Puzzle(height,width);
		Solver solver = new Solver();
		
		
		puzzle2 = buildPuzzle2(puzzle2);
		
		int x = 3;
		int y = 1;
		
		if(solver.checkPiece4B(x,y, puzzle2))
		{solver.placePiece4B(x, y, puzzle2);}
		else {System.out.println("Invalid location to place piece.");}
		
		displayPuzzle(puzzle2);
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
	 * Builds the second puzzle.
	 * 
	 * @param puzzle The puzzle being built.
	 * @return The second puzzle.
	 */
	private static Puzzle buildPuzzle2(Puzzle puzzle) {
		Puzzle newPuzzle = puzzle;
		int[][] newBoard = newPuzzle.getBoard();
		
		newBoard[0][0] = 9;
		newBoard[0][5] = 9;
		newBoard[2][0] = 9;
		newBoard[2][5] = 9;
		newBoard[4][0] = 9;
		newBoard[4][5] = 9;
		
		newPuzzle.setBoard(newBoard);
		
		return newPuzzle;
	}
	
	

}












