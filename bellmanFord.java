class result{
    int[] dist;
    int[] parent;
    result(){}
    result(int[] dist,int[] parent){
        this.dist = dist;
        this.parent = parent;
    } 
}

public class bellmanFord {
    
    public static result bellmanFord(int[][] edges,int vertex,int s){
         int[] parent = new int[vertex];
        int[] dist = new int[vertex];
        for(int i=0;i<vertex;i++){
            parent[i] = -1;
            dist[i] = Integer.MAX_VALUE;
        }
        dist[s] = 0;
        int u,v,w;
        for(int i=0;i<vertex-1;i++){
            for(int[] edge : edges){
                u = edge[0];
                v = edge[1];
                w = edge[2];
                if(dist[u] != Integer.MAX_VALUE && dist[v] > dist[u]+w){
                    parent[v] = u;
                    dist[v] = dist[u]+w;
                }
            }
        }
        for(int[] edge : edges){
            u = edge[0];
            v = edge[1];
            w = edge[2];
            if(dist[u] != Integer.MAX_VALUE && dist[v] > dist[u]+w){
                System.out.println("negative cycle detected!");
                return null;
            }
        }
        System.out.println("source    dest    weight");
        for(int i = 0;i<vertex;i++){
            System.out.println(s+"           "+i+"        "+dist[i]);
        }
        return new result(dist,parent);
    }

    static void print_path(int destination,int[] parent){
        if(parent[destination] == -1){
            System.out.print(destination);
            return;
        }
        print_path(parent[destination],parent);
        System.out.print(" -> "+destination);
    }
    public static void main(String[] args) {
        int vertex = 5;
        int[][] edges = {
                // { 0, 1, 10 },
                // { 0, 2, 3 },
                // { 1, 2, 1 },
                // { 1, 3, 2 },
                // { 2, 1, 4 },
                // { 2, 3, 8 },
                // { 2, 4, 2 },
                // { 3, 4, 7 },
                // { 4, 3, 9 },
                {0, 1, 1},
                {1, 2, -1},
                {2, 0, -1} 
        };
       result res=  bellmanFord(edges,vertex,0);
       if(res != null){
       System.out.print("Parents : ");
       for(int p : res.parent){
        System.out.print(p+" ");
       }
       System.out.println();
       System.out.print("distance : ");
        for(int p : res.dist){
        System.out.print(p+" ");
       }
       System.out.println();
       print_path(4,res.parent);
    }
    }
}
