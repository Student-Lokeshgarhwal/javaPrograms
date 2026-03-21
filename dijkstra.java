import java.util.ArrayList;
import java.util.PriorityQueue;

public class dijkstra {

    static class pair {
        int vertex;
        int weight;

        pair(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    static Character vertex[] = { 's', 't', 'y', 'x', 'z' };
    static int v = vertex.length;
    static ArrayList<ArrayList<pair>> graph = new ArrayList<>();
    static int[] parent = new int[v];
    static int[] distance = new int[v];
    static boolean[] visited = new boolean[v];

    public static void buildGraph(ArrayList<ArrayList<pair>> graph) {

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        int[][] edges = {
                { 0, 1, 10 },
                { 0, 2, 5 },
                { 1, 3, 1 },
                { 1, 2, 2 },
                { 2, 1, 3 },
                { 2, 4, 2 },
                { 3, 4, 4 },
                { 4, 3, 6 },
                { 4, 0, 7 }
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

    public static void relax(ArrayList<ArrayList<pair>> graph, int u, pair adj) {
        distance[adj.vertex] = distance[u] + adj.weight;
        parent[adj.vertex] = u;
    }

    public static void shortestPath(ArrayList<ArrayList<pair>> graph, int s) {

        for (int i = 0; i < v; i++) {
            parent[i] = -1;
            distance[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        distance[s] = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> distance[a] - distance[b]);
        pq.add(s);
        while (!pq.isEmpty()) {
            int u = pq.poll();
            if (visited[u])
                continue;
            visited[u] = true;
            for (pair adj : graph.get(u)) {
                if (distance[adj.vertex] > distance[u] + adj.weight) {
                    relax(graph, u, adj);
                    pq.add(adj.vertex);
                }
            }
        }
        for (int i = 0; i < v; i++) {
            System.out
                    .println(vertex[i] + " --> " + (parent[i] != -1 ? vertex[parent[i]] : "Nil") + " , " + distance[i]);
        }
    }

    public static void main(String[] args) {
        buildGraph(graph);
        shortestPath(graph, 0);
    }
}
