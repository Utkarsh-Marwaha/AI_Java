package iterative_deep_DFS;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	
	/* This state variable indicates the data value of node or vertex */
	private String name;
	
	/* This state variable indicates the level of depth at which the given node is located at */
	private int depthLevel;
	
	/* This state variable holds all the nodes which are adjacent to the given node */
	private List<Node> adjacencyList;

	/**
	 * Parameterized constructor of the Node class
	 * @param name
	 */
	public Node(String name) {
		this.name = name;
		this.adjacencyList  = new ArrayList<>();
		this.depthLevel = 0;
	}
	
	/**
	 * method to append a node to the adjacency list of a given node
	 * @param node node which is to be added to the adjacency list of the given node
	 */
	public void addNeighbour (Node node) {
		this.adjacencyList.add(node);
	}
	
	@Override
	public String toString() {
		return this.name;
	}

	/*
	 * Getters and Setters
	 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepthLevel() {
		return depthLevel;
	}

	public void setDepthLevel(int depthLevel) {
		this.depthLevel = depthLevel;
	}

	public List<Node> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(List<Node> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}
	
}
