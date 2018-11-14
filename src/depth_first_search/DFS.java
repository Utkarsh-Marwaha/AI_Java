package depth_first_search;

import java.util.List;
import java.util.Stack;

import graph_algos.Vertex;

public class DFS {

	/**
	 * By calling this method with the list of all nodes in the graph, we get
	 * to perform a DFS on the complete graph, including all the disconnected components
	 * @param vertices list of all nodes in the graph
	 */
	public void allComponentDFS(List <Vertex> vertices) {
		
		for (Vertex v : vertices) {
			if (!v.isVisited()) {
				v.setVisited(true);
				iterativeDFS(v);
			}
		}
	}
	
	public void iterativeDFS(Vertex root) {
		
		/**
		 * This list of nodes has a last in last out structure
		 */
		Stack<Vertex> nodeStack = new Stack<>();
		
		// add the root node to the stack of nodes
		nodeStack.push(root);
		
		// mark the root node (this is where graph traversal begins) as visited
		root.setVisited(true);
		
		while(!nodeStack.isEmpty()) {
			
			// remove the latest node from the stack (this will be the deepest node in the graph)
			Vertex currentVertex = nodeStack.pop();
			
			// mark the node as visited
			currentVertex.setVisited(true);
			
			// print the node which has just been popped
			System.out.println(currentVertex + " ");
			
			
			// add all the unvisited neighbour vertices of the current vertex to the stack 
			for (Vertex neighbour : currentVertex.getNeighbours()) {
			
				if (!neighbour.isVisited()) {	
					nodeStack.push(neighbour);
					// mark the pushed neighbour nodes as visted
					neighbour.setVisited(true);
				}
			}
		}
		
	}
	
	/*The recursive depth first search algorithm uses a stack under the hood
	 * to perform the recursion*/
	public void recursiveDFS(Vertex root) {
		// print the node which has just been popped
		System.out.println(root + " ");
		
		// perform a depth first search on all the neighbouring nodes which have not been visited yet
		for (Vertex vertex : root.getNeighbours()) {
			if (!vertex.isVisited()) {
				vertex.setVisited(true);
				recursiveDFS(vertex);
			}
		}
	}
}
