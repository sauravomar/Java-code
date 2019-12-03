package com.ril.grocery.slotManagement.redis.publisher;

import java.util.LinkedList;

public class MotherVertx {

	@SuppressWarnings("unused")
	private int v; // No. of vertices
	private LinkedList<Integer> adj[]; // Adjacency List

	// Constructor

	MotherVertx(int v) {
		this.v= v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList<Integer>();
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	
	
	public void mother() {
		
		boolean visited[] = new boolean[adj.length];
		
		int motherVertx = 0;
		for(int i=0; i<adj.length;i++) {
			if(!visited[i]) {
				motherVertx(visited, i);
				motherVertx =  i;
			}
		}
		
		visited = new boolean[adj.length];
		motherVertx(visited, motherVertx);
		
		for(int i=0; i<adj.length;i++) {
			if(!visited[i]) {
				System.out.println("No nother vertx");
				return;
			}
		}
		
		System.out.println(" Mother Vertx "  + motherVertx);
		
	}
	private void motherVertx(boolean visited[], int vertices) {
		visited[vertices] = true;

		for (int nodes : adj[vertices]) {
			if (!visited[nodes])
				motherVertx(visited, nodes);
		}
		
	}
	
	public static void main(String[] args) {
		MotherVertx g =  new MotherVertx(7); 
		    g.addEdge(0, 1); 
		    g.addEdge(0, 2); 
		    g.addEdge(1, 3); 
		    g.addEdge(4, 1); 
		    g.addEdge(6, 4); 
		    g.addEdge(5, 6); 
		    g.addEdge(5, 2); 
		    g.addEdge(6, 0); 
		    
		    g.mother();
		  
	}

	
}
