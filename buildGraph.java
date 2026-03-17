import java.util.ArrayList;
import java.util.Scanner;

class buildGraphMatrix {
    public static void buildGraphMatrix(int v) {
        int[][] graph = new int[v][v];

        int[][] edges = {
                { 0, 1, 4 },
                { 0, 2, 3 },
                { 1, 3, 7 },
                { 1, 4, 2 },
                { 3, 5, 1 },
                { 4, 5, 6 }
        };

        for (int i = 0; i < edges.length; i++) {
            int U = edges[i][0];
            int V = edges[i][1];
            int W = edges[i][2];

            graph[U][V] = W;
            graph[V][U] = W;
        }

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

}

class Pair{
    int vertex;
    int weight;
    Pair(int vertex,int weight){
        this.vertex = vertex;
        this.weight = weight;
    }
}

class buildGraphList {

    public static void buildGraphList(int v) {
        ArrayList<ArrayList<Integer>> aList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            aList.add(new ArrayList<>());
        }

        int[][] edges = {
            {0,1},
            {0,2},
            {1,3},
            {1,4},
            {3,5},
            {4,5},
        };

        for(int[] edge:edges){
            int U = edge[0];
            int V = edge[1];

            aList.get(U).add(V);
            aList.get(V).add(U);    //remove for directed graph
        }

        for (int i = 0; i < v; i++) {
            System.out.print(i +" --> ");
            for (int val : aList.get(i)) {
                System.out.print(val + ",");
            }
            System.out.println();
        }
    }

    public static void buildGraphListWeighted(int v){
        ArrayList<ArrayList<Pair>> Alist = new ArrayList<>();
        for(int i=0;i<v;i++){
            Alist.add(new ArrayList<>());
        }
        int[][] edges = {
            {0,1,4},
            {0,2,3},
            {1,3,7},
            {1,4,2},
            {3,5,3},
            {4,5,6},
        };

        for(int[] edge : edges){
           int U = edge[0];
           int V = edge[1];
           int W = edge[2];

           Alist.get(U).add(new Pair(V, W));
           Alist.get(V).add(new Pair(U, W));
        }

        for (int i = 0; i < v; i++) {
            System.out.print(i +" --> ");
            for (Pair list : Alist.get(i)) {
                System.out.print(list.vertex+"("+list.weight + ") , ");
            }
            System.out.println();
        }
    }
}

public class buildGraph {
    public static void main(String[] args) {
        buildGraphMatrix.buildGraphMatrix(6);
        buildGraphList.buildGraphList(6);
        buildGraphList.buildGraphListWeighted(6);
    }
}
