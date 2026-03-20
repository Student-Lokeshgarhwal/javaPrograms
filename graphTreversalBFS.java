import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graphTreversalBFS {

    static Character[] vertex = {'s','r','v','w','t','u','y','x'};
    static int v = vertex.length;
    static String[] color = new String[v];
    static int[] parent = new int[v];
    static int[] distance = new int[v];

    public static void BFS(ArrayList<ArrayList<Integer>> graph,int v){
        for(int i=0;i<v;i++){
            color[i] = "White";
            parent[i] = -1;
            distance[i] = Integer.MAX_VALUE;
        }
        color[0] = "Gray";
        distance[0] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while (!queue.isEmpty()) {
            int U = queue.remove();
            System.out.println();
            System.out.print(vertex[U]+"--");
            for(int i : graph.get(U)){
                if(color[i].equals("White")){
                    color[i] = "Gray";
                    parent[i] = U;
                    distance[i] = distance[U]+1;
                    queue.add(i);
            System.out.print(vertex[i]);

                }
            }
            color[U] = "Black";
        }
    }
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[][] edges = {
            {0,1},
            {0,3},
            {1,2},
            {3,4},
            {3,7},
            {4,5},
            {4,7},
            {5,6},
            {6,7},
        };

        for(int i=0;i<v;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int U = edges[i][0];
            int V = edges[i][1];
            graph.get(U).add(V);
            graph.get(V).add(U);
        }
        
        for(int i=0;i<graph.size();i++){
            System.out.print(vertex[i]+" --> ");
            for(int x :graph.get(i)){
                System.out.print(vertex[x]+ " ");
            }
            System.out.println();
        }

        BFS(graph,v);
    }
}
