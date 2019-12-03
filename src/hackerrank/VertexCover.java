package com.ril.slot;

import java.util.Iterator;
import java.util.LinkedList;

@SuppressWarnings("unchecked")
public class VertexCover {

	class Graph {
		private int vertices;
		private LinkedList<Integer> adj[];

		Graph(int v) {
			this.vertices = v;
			adj = new LinkedList[v];
			for (int i = 0; i < v; ++i)
				adj[i] = new LinkedList<Integer>();
		}

		void addEdge(int v, int w) {
			adj[v].add(w);
			adj[w].add(v);
		}
	}

	public void vertexCover(Graph graph) {

		boolean visited[] = new boolean[graph.vertices];

		for (int i = 0; i < graph.vertices; i++) {

			if (visited[i] == false) {
				Iterator<Integer> iterator = graph.adj[i].iterator();
				while (iterator.hasNext()) {
					int v = iterator.next();
					if (visited[v] == false) {
						visited[i] = true;
						visited[v] = true;
						break;
					}
				}
			}
		}

		for (int i = 0; i < graph.vertices; i++) {
			if (visited[i])
				System.out.println(i);
		}

	}

	public static void main(String[] args) {

		VertexCover cover = new VertexCover();

		Graph g = cover.new Graph(7);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(3, 4);
		g.addEdge(4, 5);
		g.addEdge(5, 6);
		cover.vertexCover(g);
	}

}
