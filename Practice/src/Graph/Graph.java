package Graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by saurav on 31/5/14.
 */

public class Graph {

   public  boolean  directed = false;
   public  int adj[][];
   public  int visited[];
   public  int nodes;

    Graph(boolean dir, int len){

        directed = dir;
        adj =   new int [len][len];
        visited = new int [len];
        nodes = len;
    }

    public int [] getAdjacentVertices(int ver){
        return adj[ver];
    }
    public boolean isAdjacent(int src, int des){
        return (adj[src][des]>0);
    }
    public int cost(int src, int des){
        return adj[src][des];
    }
    public void dfs(int adj[][],int node){
        System.out.println("visted " + (node+1));
        visited[node] = 1;

        for(int i=0;i<nodes;i++ ){
            if(visited[i] ==0 && adj[node][i] > 0) {
                dfs(adj,i);
            }
        }

    }

    public void bfs(int adj[][],int node){
        System.out.println("visted " + (node+1));
        visited[node] = 1;
        Queue<Integer>queue = new LinkedList<Integer>();
        queue.add(node);

        while (!queue.isEmpty()){
            node = queue.remove();
            for(int i=0;i<nodes;i++ ){
                if(visited[i] == 0 && adj[node][i] > 0) {
                    System.out.println("visted " + (i+1));
                    visited[i] = 1;
                    queue.add(i);
                }
            }
        }


    }

    public void dfsTraverse(int adj[][]){
        for(int i =0;i<nodes;i++){
            if(visited[i]==0) dfs(adj,i);
        }
    }
    public void bfsTraverse(int adj[][]){
        for(int i =0;i<nodes;i++){
            if(visited[i]==0) bfs(adj, i);
        }
    }
    public static void main(String args[]){

        Graph graph = new Graph(false,8);

        int adj [][] = new int[8][8];

        adj[0][1] = 1;
        adj[1][0] = 1;

        adj[1][2] = 1;
        adj[2][1] = 1;
        adj[1][7] = 1;
        adj[7][1] = 1;

        adj[2][3] = 1;
        adj[3][2] = 1;
        adj[2][4] = 1;
        adj[2][4] = 1;

        adj[4][7] = 1;
        adj[7][4] = 1;
        adj[4][5] = 1;
        adj[4][5] = 1;
        adj[4][6] = 1;
        adj[6][4] = 1;

        graph.adj = adj;
      //  graph.dfsTraverse(adj);
        graph.bfsTraverse(adj);

    }
}
