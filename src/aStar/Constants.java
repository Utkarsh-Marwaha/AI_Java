package aStar;

public class Constants {

	
	// Constructor is made private
	private Constants() {
		
	}
	
	// this constant indicates the number of rows present in our grid
	public static final int NUM_ROWS = 5;
	
	// this constant indicates the number of columns present in our grid
	public static final int NUM_COLS = 8;
	
	// this constant indicates the cost of moving laterally (i.e. in horizontal and vertical direction) on our grid
	public static final int HORIZONTAL_VERTICAL_COST = 10;
	
	// this constant indicates the cost of moving diagonally on the grid
	public static final int DIAGONAL_COST = 14;
}
