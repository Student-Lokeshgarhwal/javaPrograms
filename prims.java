import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Edge {
    int sourceV;
    int destinationV;
    int weight;

    Edge() {
    }

    Edge(int sourceV, int destinationV, int weight) {
        this.sourceV = sourceV;
        this.destinationV = destinationV;
        this.weight = weight;
    }

    Edge(int destinationV, int weight) {
        this.destinationV = destinationV;
        this.weight = weight;
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

public class prims {
    static String[] vertex = { "s0", "s1", "s2", "s3" };
    static int v = vertex.length;
    static ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
    static ArrayList<Edge> Edges = new ArrayList<>();
    static int[] parent = new int[v];
    static int[] distance = new int[v];
    static boolean[] visited = new boolean[v];

    public static void buildGraph() {
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        Edges.add(new Edge(0, 1, 4));
        Edges.add(new Edge(0, 2, 3));
        Edges.add(new Edge(1, 2, 4));
        Edges.add(new Edge(1, 3, 9));
        Edges.add(new Edge(3, 2, 4));

        int sv;
        int dv;
        int w;
        for (Edge e : Edges) {
            sv = e.sourceV;
            dv = e.destinationV;
            w = e.weight;

            graph.get(sv).add(new Edge(dv, w));
            graph.get(dv).add(new Edge(sv, w));
        }

        for (int i = 0; i < graph.size(); i++) {
            for (Edge e : graph.get(i)) {
                System.out.println(i + " , " + e.destinationV + " - " + e.weight);
            }
        }

    }

    public static void prims(int s){
        for(int i=0;i<v;i++){
            parent[i] = -1;
            distance[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        distance[s] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.weight - b.weight);
        int i;
        pq.add(new Pair(s,distance[s]));
        while (!pq.isEmpty()) {
            Pair pair = pq.poll();
            i = pair.vertex;
            if(visited[i]) continue;
            visited[i] = true;
            for(Edge e : graph.get(i)){
               int destV = e.destinationV;
               int weight = e.weight;
               if(!visited[destV] && weight < distance[destV]){
                  distance[destV] = weight;
                  parent[destV] = i;
                  pq.add(new Pair(destV, distance[destV]));
               }
            }
        }
        System.out.println("MST");
        for(int k=1;k<v;k++){
            System.out.println("Edge: "+parent[k] +" - "+k+" Weight: "+distance[k]);
        }
    }
    public static void main(String[] args) {
        buildGraph();
        prims(0);
    }
}
