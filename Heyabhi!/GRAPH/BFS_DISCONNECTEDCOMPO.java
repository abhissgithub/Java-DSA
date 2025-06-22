package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_DISCONNECTEDCOMPO {
    static class Edge {
        int src;
        int dest;


        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;

        }
    }

    public static void CrGraph(ArrayList<Edge> Graph[]) {
        for (int i = 0; i < Graph.length; i++) {
            Graph[i] = new ArrayList<>();

        }
        Graph[0].add(new Edge(0, 1));
        Graph[0].add(new Edge(0, 2));

        Graph[1].add(new Edge(1, 0));
        Graph[1].add(new Edge(1, 3));

        Graph[2].add(new Edge(2, 0));
        Graph[2].add(new Edge(2, 4));

        Graph[3].add(new Edge(3, 1));
        Graph[3].add(new Edge(3, 4));
        Graph[3].add(new Edge(3, 5));

        Graph[4].add(new Edge(4, 2));
        Graph[4].add(new Edge(4, 5));
        Graph[4].add(new Edge(4, 3));

        Graph[5].add(new Edge(5, 3));
        Graph[5].add(new Edge(5, 4));
        Graph[5].add(new Edge(5, 6));

        Graph[6].add(new Edge(6, 5));
    }

    static void bfs(ArrayList<Edge> Graph[], int V, boolean visited[], int start) {
        Queue<Integer> q = new LinkedList();
        q.add(start);
        while (!q.isEmpty()) {
            int cur = q.remove();
            if (visited[cur] = false) {
                System.out.print(cur + " ");
                visited[cur] = true;

                for (int i = 0; i < Graph[cur].size(); i++) {
                    Edge e = Graph[cur].get(i);
                    q.add(e.dest);
                }
            }


        }

    }


    public static void main(String[] args) {
        int V = 10;
        ArrayList<Edge>[] Graph = new ArrayList[V];
        CrGraph(Graph);

        /*

         0--1--2
         3--4

         */

        boolean visited[] = new boolean[V];
        for (int i=0;i<V;i++){
            if (visited[i]==false){
                bfs(Graph,V,visited,i);

            }
        }



    }
}
