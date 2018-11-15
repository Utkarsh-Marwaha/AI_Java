package iterative_deep_DFS;

import java.util.Stack;

public class Iterative_Deep_DFS {

	private Node targetVertex;
	
	private volatile boolean targetFound;
 
	public Iterative_Deep_DFS(Node targetVertex) {
		this.targetVertex = targetVertex;
	}
	
	public void runDeepningSearch(Node root) {
		
		int depth = 0;
		
		while (!targetFound) {
			System.out.println();
			depthFirstSearch(root, depth);
			depth++;
		}
	}

	private void depthFirstSearch(Node root, int depth) {
		
		System.out.println();
		
		Stack<Node> nodeStack = new Stack<>();
		root.setDepthLevel(0);
		
		nodeStack.push(root);
		
		while (!nodeStack.isEmpty()) {
			
			Node currentNode = nodeStack.pop();
			System.out.print(currentNode + " ");
		
			if (currentNode.getName().equals(this.targetVertex.getName())) {
				System.out.println("Node has been found");
				this.targetFound = true;
				return;
			}
			
			/*cannot go any deeper in the tree*/
			if (currentNode.getDepthLevel() >= depth) {
				// continue in the while loop (for the next iteration)
				continue;
			}
			
			// increment the depth level on a layer by layer basis
			for (Node node: currentNode.getAdjacencyList()) {
				node.setDepthLevel(currentNode.getDepthLevel() + 1);
				nodeStack.push(node);
			}
		
		}
		
		
		
	}

	
	
}
