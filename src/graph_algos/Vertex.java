package graph_algos;


import java.util.ArrayList;
import java.util.List;

public class Vertex {

	/* This state variable represents the data/value of the vertex (node) */
	private int data;
	
	/* This state variable indicates whether the vertex has already been visited or not */
	private boolean isVisited;
	
	/* This state variable will hold all the neighbour vertices*/
	private List<Vertex> neighbours;

	/**
	 * 
	 * @param data: represents the data value of the given node
	 */
	public Vertex(int data) {
		this.data = data;
		this.neighbours = new ArrayList<>();
	}

	/*This method returns the data value stored by the current node*/
	public int getData() {
		return data;
	}

	/*
	 * This method returns true if the given vertex has already been visited, otherwise returns false
	 */
	public boolean isVisited() {
		return isVisited;
	}

	/**
	 * 
	 * @return the list of neighbours of the given node
	 */
	public List<Vertex> getNeighbours() {
		return neighbours;
	}

	/**
	 * 
	 * @param data value which has to be assigned to the given node
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * 
	 * @param isVisited boolean value assigned to the node based on whether it has been visited or not
	 */
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	/**
	 * 
	 * @param neighbours list of neighbours which have to be assigned to that of the given node
	 */
	public void setNeighbours(List<Vertex> neighbours) {
		this.neighbours = neighbours;
	}
	
	/**
	 * method to add a particular vertex to the list of neighbours of the current vertex
	 * @param vertex vertex to be added to the list of neighbours of the given node
	 */
	public void addNeighbourVertex(Vertex vertex) {
		this.neighbours.add(vertex);
	}
	
	@Override
	public String toString() {
		return "" + this.data;
	}
	
}
