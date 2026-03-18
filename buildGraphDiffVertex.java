import java.util.ArrayList;

public class buildGraphDiffVertex {
    public static void main(String[] args) {
        String[] vertex = { "A1", "A2", "B10", "A9" };
        int v = vertex.length;
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            g.add(new ArrayList<>());
        }

        int[][] edges = {
                { 0, 1 },
                { 0, 2 },
                { 2, 3 }
        };
        for (int[] adjVals : edges) {
            int U = adjVals[0];
            int V = adjVals[1];
            g.get(U).add(V);
            g.get(V).add(U);
        }

        for (int i = 0; i < g.size(); i++) {
            System.out.print(vertex[i] + " --> ");
            for (int val : g.get(i)) {
                System.out.print(vertex[val] + " ");
            }
            System.out.println();
        }
        // System.out.println(g.get(0));

    }
}
