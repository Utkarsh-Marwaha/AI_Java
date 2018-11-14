package breadth_first_search;

import java.util.LinkedList; 
import java.util.Queue;

import graph_algos.Vertex;

public class BFS {

	
	public void bfs(Vertex root) {
		
		/**
		 * This list of nodes will has a First in First Out Structure
		 */
		Queue<Vertex> pendingNodes = new LinkedList<>();
		
		// add the root of the graph to the queue of pending nodes
		pendingNodes.add(root);
		// mark the root node of the graph (this is where the BFS traversal begins) as visited
		root.setVisited(true);
		
		
		while (!pendingNodes.isEmpty()) {
			
			// dequeue the first vertex from the queue of pending nodes 
			Vertex currentVertex = pendingNodes.remove();
			
			// mark the dequeued vertex as visited
			currentVertex.setVisited(true);
			
			// print the node which has just been dequeued
			System.out.println(currentVertex + " ");
			
			// add the list of all unvisited neighbours of the current Vertex to the queue of pending nodes
			for (Vertex neighbour : currentVertex.getNeighbours()) {
				if (!neighbour.isVisited()) {
					pendingNodes.add(neighbour);
					
					// mark the neighbour vertices of current vertex as visited
					neighbour.setVisited(false);
				}		
			}
		}
	}
}
