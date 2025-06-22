package GRAPH;

import java.util.ArrayList;

public class DFS {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void CreateDfs(ArrayList<Edge> Graph[]) {
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


    public static void dFs(ArrayList<Edge>Graph[],int cur,boolean[]vis) {
        System.out.print(cur+" ");
        vis[cur]=true;
        for (int i=0;i<Graph[cur].size();i++){
            Edge e=Graph[cur].get(i);
            if (vis[e.dest]==false){
                dFs(Graph,e.dest,vis);
            }
        }
    }


    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> Graph[] = new ArrayList[v];
        CreateDfs(Graph);
        boolean vis []=new boolean[v];
        dFs(Graph,0,vis);
        System.out.println();
    }
}
