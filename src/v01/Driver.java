package v01;

public class Driver {

	public static void main(String[] args) {
		Puzzle puzzle2 = new Puzzle(6,6);
		Solver solver = new Solver();
		
		puzzle2.setBoard(buildPuzzle2(puzzle2.getBoard()));
		
		
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
	 * Builds the first puzzle.
	 * 
	 * @param puzzle The puzzle being built.
	 * @return The board of the puzzle being built.
	 */
	private static int[][] buildPuzzle2(int[][] board) {
		int[][] newBoard = board;
		
		newBoard[0][0] = 9;
		newBoard[0][5] = 9;
		newBoard[2][0] = 9;
		newBoard[2][5] = 9;
		newBoard[4][0] = 9;
		newBoard[4][5] = 9;
		
		return newBoard;
	}
	
	

}












