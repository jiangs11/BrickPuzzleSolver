package v01;

/**
 * A brick puzzle that stores the board and the puzzle pieces.
 * 
 * @author Joseph Frost
 * @version 2020.09.26
 */
public class Puzzle {

	private int height;
	private int width;
	private int[][] board;
	
	/**
	 * 
	 * 
	 * @param height
	 * @param width
	 */
	public Puzzle(int height, int width) {
		this.height = height;
		this.width = width;
		this.board = new int[height][width];
	}

	/* Generic Getters and Setters */
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int[][] getBoard() {
		return board;
	}

	public void setBoard(int[][] board) {
		this.board = board;
	}
	
	
}
