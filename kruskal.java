import java.util.ArrayList;
import java.util.List;

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

public class kruskal {
    static String[] vertex = { "s0", "s1", "s2", "s3" };
    static int v = vertex.length;
    static ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
    static ArrayList<Edge> Edges = new ArrayList<>();
    static ArrayList<Edge> MST = new ArrayList<>();

    public static void buildGraph() {
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        Edges.add(new Edge(0, 1, 1));
        Edges.add(new Edge(0, 2, 3));
        Edges.add(new Edge(0, 3, 4));
        Edges.add(new Edge(1, 3, 5));
        Edges.add(new Edge(1, 2, 2));
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

    public static int findParent(int[] parent,int currVertex){
        if(parent[currVertex] != currVertex){
            parent[currVertex] = findParent(parent, parent[currVertex]);
        }
        return parent[currVertex];
    }
    public static void union(int[] parent,int[] rank,int sp,int dp) {
        
        if(rank[sp] > rank[dp]){
            parent[dp] = sp;
        }else if(rank[sp] < rank[dp]){
            parent[sp] = dp;
        }else{
            parent[dp] = sp;
            rank[sp]+=1;
        }
         
    }
    public static void MSTKruskal(){
        int[] parent=new int[v];
        int[] rank=new int[v];
        
        for(int i=0;i<v;i++){
            parent[i] = i;
            rank[i] = 0;
        }
        Edges.sort((a,b) -> a.weight - b.weight);
        for(Edge e : Edges){
            int sourceP = findParent(parent,e.sourceV);
            int destP = findParent(parent,e.destinationV);

            if(sourceP != destP){
                MST.add(e);
                union(parent,rank,sourceP,destP);
            }
        }
        System.out.println("MST");
        int totalWeight = 0;
        for(Edge e : MST){
            System.out.println(e.sourceV +" , "+e.destinationV+" - "+e.weight);
            totalWeight += e.weight;
        }
        System.out.println("Total Weight : "+totalWeight);
    }
    public static void main(String[] args) {
        buildGraph();
        MSTKruskal();
    }
}
