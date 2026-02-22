import java.util.Arrays;

class Items  {
    float price;
    float weight;
    float ratio;
    Items(float price,float weight){
        this.price = price;
        this.weight = weight;
        this.ratio = price/weight;
    }
}

public class fractionalKnapsack {

    public static void main(String[] args) {
        Items[] items = {
            new Items(20,10),
            new Items(20,15),
            new Items(10,15),
            new Items(50,30)
        };
        Arrays.sort(items,(a,b)->Float.compare(b.ratio, a.ratio));
        int capacity = 60;
        float maxProfit = 0;
        float fraction = 0;
        for(int i = 0;i<items.length;i++){
            if(capacity>=items[i].weight){
                maxProfit += items[i].price;
                capacity -= items[i].weight;
            }else{
                fraction = (capacity/items[i].weight);
                maxProfit += fraction*items[i].price;
                break;
            }
        }
        System.out.println(maxProfit);
    }
}









// public class fractionalKnapsack {
//     public static void main(String[] args) {
//         float[] p = new float[] { 20, 10, 20, 50 };
//         float[] w = new float[] { 10, 15, 20, 35 };
//         int maxCapacity = 60;
//         float[] pw = new float[p.length];
//         float[] x = new float[w.length];
//         int availableCapacity = maxCapacity;
//         float profit = 0;
//         for (int i = 0; i < pw.length; i++) {
//             pw[i] = p[i] / w[i];
//         }
//         int temp;
//         int j;
//         float t;
//         for (int i = 0; i < pw.length - 1; i++) {
//             temp = i;
//             j = i + 1;
//             while (j < pw.length) {
//                 if (pw[temp] < pw[j]) {
//                     temp = j;
//                 }
//                 j++;
//             }
//             if (i != temp) {
//                 t = pw[i];
//                 pw[i] = pw[temp];
//                 pw[temp] = t;
//                 t = p[i];
//                 p[i] = p[temp];
//                 p[temp] = t;
//                 t = w[i];
//                 w[i] = w[temp];
//                 w[temp] = t;
//             }
//         }
//         // for(int i =0;i<w.length;i++){
//         //     System.out.print(p[i]+" ");
//         // }
//         // System.out.println();
//         //  for(int i =0;i<w.length;i++){
//         //     System.out.print(w[i]+" ");
//         // }
//         // System.out.println();
//         //  for(int i =0;i<w.length;i++){
//         //     System.out.print(pw[i]+" ");
//         // }
//         int i = 0;
//         while (i < w.length) {
//             if (availableCapacity >= w[i]) {
//                 x[i] = 1;
//                 availableCapacity -= w[i];
//                 i++;
//             }else break;
//         }
//         if(i<w.length){
//             x[i] = availableCapacity/w[i];
//         }
//         for(int k =0;k<x.length;k++){
//             profit = profit + x[k]*p[k];
//         }
//         System.out.println(profit);
//     }
// }
