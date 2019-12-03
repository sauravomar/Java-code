package com.ril.slot;

import java.util.LinkedList;

@SuppressWarnings("unchecked")
public class Graph {

	    private int v;   // No. of vertices 
	    private LinkedList<Integer> adj[]; // Adjacency List Represntation 
	  
	    // Constructor 
	   
		Graph(int v) { 
	        this.v = v; 
	        adj = new LinkedList[v]; 
	        
	        for(int i=0; i<v; ++i) 
	            adj[i] = new LinkedList<Integer>(); 
	    } 
	  
	    // Function to add an edge into the graph 
	    void addEdge(int v,int w) { 
	        adj[v].add(w); 
	        adj[w].add(v); 
	    }

		public int getV() {
			return v;
		}

		public void setV(int v) {
			this.v = v;
		}

		public LinkedList<Integer>[] getAdj() {
			return adj;
		}

		public void setAdj(LinkedList<Integer>[] adj) {
			this.adj = adj;
		} 
	    
}
