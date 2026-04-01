public class floydII {
    static final int INF = 1000000000;

    public static int[][] floyd(int[][] D, int x) {
        int[][] P = new int[x][x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                P[i][j] = -1;
            }
        }
        for (int k = 0; k < x; k++) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    if (D[i][k] != INF && D[k][j] != INF) {
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
                if (D[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(D[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(P[i][j] + " ");
            }
            System.out.println();
        }
        ;
        return P;
    }

    public static void print_path(int s, int v, int[][] p) {
        if (p[s][v] == -1) {
            System.out.print(s + " --> " + v);
            return;
        } else if (s == v) {
            System.out.println(s);
            return;
        } else {
            int k = p[s][v];
            print_path(s, k, p);
            System.out.print(" -> ");
            print_path(k, v, p);
        }
    }

    public static void main(String[] args) {
        int v = 4;
        int[][] graph = {
                { 0, 5, INF, INF },
                { 50, 0, 15, 5 },
                { 30, INF, 0, 15 },
                { 15, INF, 5, 0 },
        };
        int[][] p = floyd(graph, v);
        print_path(0, 2, p);
    }
}
