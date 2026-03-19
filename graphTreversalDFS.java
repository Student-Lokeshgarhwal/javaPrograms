import java.util.ArrayList;

public class graphTreversalDFS {

    static int v = 5;
    static String[] color = new String[v];
    static int[] parent = new int[v];
    static int[] discovery = new int[v];
    static int[] finish = new int[v];

    static int time = 0;
    static int index = 0;

    public static void DFS(ArrayList<ArrayList<Integer>> graph){
        for (int i = 0; i < graph.size(); i++) {
            if (color[i].equals("White")){
                DFS_Treverse(graph, i);
            }
        }
    }

    public static void DFS_Treverse(ArrayList<ArrayList<Integer>> graph, int i) {
        time += 1;
        discovery[i] = time;
        color[i] = "Gray";
        System.out.print(i+" ");
        for (int adj : graph.get(i)) {
            if (color[adj].equals("White")) {
                parent[adj] = i;
                DFS_Treverse(graph, adj);
            }
        }
        color[i] = "Black";
        finish[i] = ++time;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(3).add(4);

        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i + " --> ");
            for (int val : graph.get(i)) {
                System.out.print(val + ",");
            }
            System.out.println();
        }

        for (int i = 0; i < v; i++) {
            color[i] = "White";
        }
        for (int i = 0; i < v; i++) {
            parent[i] = -1;
        }

        DFS(graph);

    }
}
