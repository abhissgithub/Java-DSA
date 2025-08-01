package GRAPH;

import java.lang.classfile.ClassReader;
import java.util.ArrayList;

public class WEIGHTEDEDGE {

    static class Edge{
        int src;
        int dest;
        int wt;

        public  Edge(int s,int d, int w){
        this.src=s;
        this.dest=d;
        this.wt=w;
    }
    public static void CreateGraph(ArrayList<Edge> graph []){
        for (int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2,5));

        graph[1].add(new Edge(1,2,5));
        graph[1].add(new Edge(1,3,5));

        graph[2].add(new Edge(2,0,5));
        graph[2].add(new Edge(2,1,5));
        graph[2].add(new Edge(2,3,5));

        graph[3].add(new Edge(3,2,5));
        graph[3].add(new Edge(3,1,5));
    }

        public static void main(String[] args) {
            int V=4;
            ArrayList <Edge> graph [] = new ArrayList[V];
            CreateGraph(graph);

//            To find neighbor of 2's
            for (int i=0;i< graph[2].size();i++){
                Edge e=graph[2].get(i);
                System.out.println(e.dest+","+e.wt);

            }

        }

}
}
