package com.ril.slot;

public class CycleInGraph {

	boolean isCycle(int start, Graph graph, boolean visited[], int parent) {

		for (int vertices : graph.getAdj()[start]) {
			if (visited[vertices] && parent != vertices)
				return true;
			if (!visited[vertices]) {
				visited[vertices] = true;
				if(isCycle(vertices, graph, visited, start)) return true;
			}
		}
		return false;
	}

	boolean isCycleUtil(Graph graph) {

		boolean visited[] = new boolean[graph.getV()];

		for (int i = 0; i < graph.getV(); i++) {
			if (!visited[i]) {
				visited = new boolean[graph.getV()];
				visited[i] = true;
				if (isCycle(i, graph, visited, i))
					return true;
			}
		}

		return false;
	}

	// Driver method to test above methods
	public static void main(String args[]) {
		// Create a graph given in the above diagram
		Graph g1 = new Graph(5);
		g1.addEdge(1, 0);
		g1.addEdge(0, 2);
		g1.addEdge(0, 3);
		g1.addEdge(3, 4);
		g1.addEdge(4, 0);

		
		Graph g2 = new Graph(3); 
        g2.addEdge(0, 1); 
        g2.addEdge(1, 2); 
        
		System.out.println(new CycleInGraph().isCycleUtil(g1));


	}

}
