package aStar;

public class Node {

	// how far away is the node from the starting point?
	// In other words, it is the cost of reaching the current node from the starting node
	private int g_val;

	// how far away is the node from the destination point?
	// In other words, it is an estimate of the cost required for reaching the destination node from the current node.
	private int h_val;


	// This indicates the index of the row in which the current node is present
	private int rowIndex;

	// This indicates the index of the column in which the current node is present
	private int columnIndex;

	// This is reference to the previous node (This is how me track the nodes on the shortest path)
	private Node predecessor;

	// This indicates whether the current node is an obstacle or not.
	private boolean isObstacle;

	/**
	 * Parameterized Constructor
	 * @param rowIndex the index of the row in which the current node is located
	 * @param columnIndex the index of the column in which the current node is located
	 */
	public Node(int rowIndex, int columnIndex) {
		this.rowIndex = rowIndex;
		this.columnIndex = columnIndex;
	}

	/*
	 * Getters and Setters 
	 * 
	 */
	public int getG_val() {
		return g_val;
	}

	public void setG_val(int g_val) {
		this.g_val = g_val;
	}

	public int getH_val() {
		return h_val;
	}

	public void setH_val(int h_val) {
		this.h_val = h_val;
	}

	public int getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	public int getColumnIndex() {
		return columnIndex;
	}

	public void setColumnIndex(int columnIndex) {
		this.columnIndex = columnIndex;
	}

	public Node getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Node predecessor) {
		this.predecessor = predecessor;
	}

	public boolean isObstacle() {
		return isObstacle;
	}

	public void setObstacle(boolean isObstacle) {
		this.isObstacle = isObstacle;
	}
	
	public int getFValue() {
		return this.getG_val() + this.getH_val();
	}

	/*
	 * Override the equals method 
	 */

	/**
	 * 
	 * @param other Node with which the current node is to be checked for equality
	 * @return True if the current node and the other Node both share the same row and column indices
	 */
	public boolean equals(Node other) {
		return this.getRowIndex() == other.getRowIndex() 
				&& this.getColumnIndex() == other.getColumnIndex();
	}
	
	@Override
	public String toString() {
		return "Node (" + this.rowIndex + ";" + this.columnIndex + ") h:"+this.h_val+" - g:"+this.g_val+" - f="+(this.g_val + this.h_val);
	}
}
