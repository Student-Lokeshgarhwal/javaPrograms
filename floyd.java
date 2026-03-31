import java.util.ArrayList;
import java.util.PriorityQueue;

public class floyd {
    static class pair {
        int vertex;
        int weight;

        pair(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    static int vertex[] = { 1,2,3,4};
    static ArrayList<ArrayList<pair>> graph = new ArrayList<>();

    public static void buildGraph(ArrayList<ArrayList<pair>> graph) {

        for (int i = 0; i < vertex.length; i++) {
            graph.add(new ArrayList<>());
        }

        int[][] edges = {
                { 0, 1, 5 },
                { 1, 0, 50 },
                { 1, 2, 15 },
                { 1, 3, 5 },
                { 2, 0, 30 },
                { 2, 3, 15 },
                { 3, 0, 15 },
                { 3, 2, 5 },
        };
        int U;
        int V;
        int W;
        for (int[] edge : edges) {
            U = edge[0];
            V = edge[1];
            W = edge[2];

            graph.get(U).add(new pair(V, W));
        }

        for (int i = 0; i < graph.size(); i++) {
        System.out.print(i + " --> ");
        for (pair v : graph.get(i)) {
        System.out.print(v.vertex + "(" + v.weight + ")");
        }
        System.out.println();
        }
    }


    public static void floyd(ArrayList<ArrayList<pair>> graph) {
        int x = vertex.length;
        int[][] D = new int[x][x];
        int[][] P = new int[x][x];
        int V, W;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j){
                    D[i][j] = 0;
                }
                else{
                D[i][j] = Integer.MAX_VALUE;
                for (pair e : graph.get(i)) {
                    V = e.vertex;
                    W = e.weight;
                    if (j == V)
                        D[i][j] = W;
                }
            }
            P[i][j] = -1;
            }
        }
        System.out.println();
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(D[i][j]+" ");
            }
            System.out.println();
        }
        for (int k = 0; k < x; k++) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                        if(D[i][k] != Integer.MAX_VALUE && D[k][j] != Integer.MAX_VALUE){
                        if (D[i][j] > D[i][k] + D[k][j]) {
                            D[i][j] = D[i][k] + D[k][j];
                            P[i][j] = k;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(D[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(P[i][j]+" ");
            }
            System.out.println();
        };
    }

    public static void main(String[] args) {
        buildGraph(graph);
        floyd(graph);
    }
}
