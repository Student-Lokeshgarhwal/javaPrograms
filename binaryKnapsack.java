public class binaryKnapsack {
    public static void main(String[] args) {
        int n = 4;
        int W = 5;
        int[][] items = {
            {2,3},
            {3,4},
            {4,5},
            {5,6}
        };
        int[][] knapSack = new int[n+1][W+1];
        for(int i = 0;i<=n;i++){
            knapSack[i][0] = 0;
        }
        for(int w = 1;w<=W;w++){
            knapSack[0][w] = 0;
        }
        int vi;
        int wi;
        for(int i=1;i<=n;i++){
            int[] item = items[i-1];
            vi = item[1];
            wi = item[0];
            for(int w = 1;w<=W;w++){
                if(w >= wi){
                    if((vi+knapSack[i-1][w-wi]) > knapSack[i-1][w]){
                        knapSack[i][w] = vi+knapSack[i-1][w-wi];
                    }else{
                        knapSack[i][w] = knapSack[i-1][w];
                    }
                }else{
                    knapSack[i][w] = knapSack[i-1][w];
                }
            }
        }
        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=W;j++){
        //         System.out.print(knapSack[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        System.out.println("profit : "+knapSack[n][W]);
        System.out.println("Items selected! ");
        int i = n;
        int k = W;
        while (i>0 && k>0) {
            if(knapSack[i][k] != knapSack[i-1][k]){
                System.out.println(i);
                k-=items[i-1][0];
                i-=1;
            }else
            i-=1;
        }
    }
}
