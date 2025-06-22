package GRAPH;

import OOP.INTERFACES.EXTENDDEMO.A;

import java.awt.*;
import java.util.*;
import java.util.stream.Gatherer;

public class DFS_DISCONNECTCOMPO {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
        public static void CreAteGraph(ArrayList<Edge> Graph[]) {
            for (int i = 0; i < Graph.length; i++) {
                Graph[i] = new ArrayList<Edge>();
            }
            Graph[0].add(new Edge(0,1));
            Graph[0].add(new Edge(0,2));

            Graph[1].add(new Edge(1,0));
            Graph[1].add(new Edge(1,3));

            Graph[2].add(new Edge(2,0));
            Graph[2].add(new Edge(2,4));

            Graph[3].add(new Edge(3,1));
            Graph[3].add(new Edge(3,4));
            Graph[3].add(new Edge(3,5));

            Graph[4].add(new Edge(4,2));
            Graph[4].add(new Edge(4,5));
            Graph[4].add(new Edge(4,3));

            Graph[5].add(new Edge(5,3));
            Graph[5].add(new Edge(5,4));
            Graph[5].add(new Edge(5,6));

            Graph[6].add(new Edge(6,5));

        }

        public static void DfS (ArrayList<Edge> Graph [],int cur,boolean vis[]) {
            System.out.print(cur+" ");
            vis[cur]=true;
            for (int i=0;i<Graph[cur].size();i++){
                Edge e=Graph[cur].get(i);
                if (vis[e.dest]==false){
                    DfS(Graph,e.dest,vis);
                }
            }
        }

        public static void main(String[] args) {
            int v=7;
            ArrayList<Edge>Graph [] = new ArrayList[v];
            CreAteGraph(Graph);
            boolean vis [] = new boolean[v];
            for (int i=0;i<v;i++){
                if (vis[i]==false){
                    DfS(Graph,i,vis);
                }
            }
            System.out.println();
        }

    }
