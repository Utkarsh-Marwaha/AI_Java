package iterative_deep_DFS;

public class App {

	public static void main(String[] args) {
		
		Node node0 = new Node("A");
		Node node1 = new Node("B");
		Node node2 = new Node("C");
		Node node3 = new Node("D");
		Node node4 = new Node("E");
		
		
		node0.addNeighbour(node1);
		node0.addNeighbour(node2);
		node1.addNeighbour(node3);
		node3.addNeighbour(node4);
	
		Iterative_Deep_DFS deep_DFS = new Iterative_Deep_DFS(node4);
		deep_DFS.runDeepningSearch(node0);
	}
}
