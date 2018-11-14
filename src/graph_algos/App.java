package graph_algos;

import java.util.Scanner; 
import breadth_first_search.BFS;
import depth_first_search.DFS;

public class App {

	public static void main(String[] args) {

		// creating an object of class BFS
		BFS breadFirstSearch = new BFS();

		// creating an object of class DFS
		DFS depthFirstSearch = new DFS();

		char choice, opt;
		Scanner in = new Scanner(System.in);

		do {
			System.out.println("Enter your choice of search");
			System.out.println("Press 'b' for breadth first search");
			System.out.println("Press 'd' for depth first search");
			choice = Character.toLowerCase(in.next().charAt(0));

			// creating a set of vertices
			Vertex vertex1 = new Vertex(1);
			Vertex vertex2 = new Vertex(2);
			Vertex vertex3 = new Vertex(3);
			Vertex vertex4 = new Vertex(4);
			Vertex vertex5 = new Vertex(5);

			// connecting the vertices to each other to make the graph
			vertex1.addNeighbourVertex(vertex2);
			vertex1.addNeighbourVertex(vertex4);
			vertex4.addNeighbourVertex(vertex5);
			vertex2.addNeighbourVertex(vertex3);


			switch (choice) {
			case 'd' : 
				// start the depth first search starting from vertex1
				depthFirstSearch.iterativeDFS(vertex1); break;

			case 'b':
				// start the breadth first search starting from vertex1
				breadFirstSearch.bfs(vertex1); break;

			default: System.out.println("wrong input");
			}

			System.out.println("Want to continue (y/n)");
			opt = Character.toLowerCase(in.next().charAt(0));
		} while (opt == 'y');
		in.close();
	}

}
