package com.ril.slot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class PrimAlgorithm {

	public List<Graph> prim(int adj[][]) {
		List<Graph> result = new ArrayList<Graph>();
		List<Graph> request = new ArrayList<Graph>();
		boolean visited[] = new boolean [adj.length];

		for (int i = 0; i < adj.length; i++) {
			for (int j = 0; j < adj.length; j++) {
				if (adj[i][j] != 0) {
					request.add(new Graph(i, j, adj[i][j]));
				}
			}
		}

		Collections.sort(request);
		
		for(int i=0; i< adj.length-1; i++) {
			
			Graph graph = null;
			
			if(i == 0) {
				graph= request.get(0);
			}else {
				Optional<Graph>optional = getMininmunEgde(request, visited);
				if(!optional.isPresent()) return new ArrayList<Graph>();
				graph= optional.get();
			}
			visited[graph.start] = true;
			visited[graph.end] = true;
			result.add(graph);
		}
		
		return result;

	}

	private Optional<Graph> getMininmunEgde(List<Graph> request, boolean visited[] ) {
		return request.stream().filter(graph -> visited[graph.start] ^ visited[graph.end]).findFirst();
	}
	
	public static void main(String[] args) {
		int graph[][] = new int[][] { { 0, 2, 0, 6, 0 }, 
            { 2, 0, 3, 8, 5 }, 
            { 0, 3, 0, 0, 7 }, 
            { 6, 8, 0, 0, 9 }, 
            { 0, 5, 7, 9, 0 } }; 

            
            System.out.println(new PrimAlgorithm().prim(graph));
		
	}
	
}

class Graph implements Comparable<Graph> {
	int weight;
	int start;
	int end;

	Graph(int start, int end, int weight) {
		this.weight = weight;
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Graph o) {
		return this.weight - o.weight;
	}

	@Override
	public String toString() {
		return "Graph [weight=" + weight + ", start=" + start + ", end=" + end + "]";
	}
	
}