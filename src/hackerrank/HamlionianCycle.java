package com.ril.slot;

public class HamlionianCycle {

	public void findCycles(int start, int arr[][], int vertex, boolean visited[], StringBuilder sb) {

		if (sb.length() == arr.length && arr[vertex][start] == 1) {
			System.out.println("found  " + sb.toString());
			return;
		}
		
		if(sb.length() == arr.length) return;

		int count = 0;
		while (count < arr.length) {
			if (arr[vertex][count] == 1 && !visited[count]) {
				sb.append(count);
				visited[count] = true;
				findCycles(start, arr, count, visited, sb);
				sb.deleteCharAt(sb.length() - 1);
				visited[count] = false;
			}
			count++;
		}

	}

	public void cycleUtil(int arr[][]) {

		for (int i = 0; i < arr.length; i++) {
			boolean[] visited = new boolean[arr.length];
			visited[i] = true;
			StringBuilder sb = new StringBuilder();
			sb.append(i);
			findCycles(i, arr, i, visited, sb);
		}

	}

	public static void main(String[] args) {
		HamlionianCycle hamiltonian = new HamlionianCycle();
		int graph1[][] = { { 0, 1, 0, 1, 0 }, { 1, 0, 1, 1, 1 }, { 0, 1, 0, 0, 1 }, { 1, 1, 0, 0, 1 },
				{ 0, 1, 1, 1, 0 }, };

		hamiltonian.cycleUtil(graph1);
	}

}
