import java.util.PriorityQueue;

class items{
    float profit;
    float weight;
    float profitPerWeight;
    items(float profit,float weight,float profitPerWeight){
        this.profit = profit;
        this.weight = weight;
        this.profitPerWeight = profitPerWeight;
    }
}
public class fractionalKSII {

    public static float Knapshak(float[] p,float[] w,float maxCapacity){
        float totalProfit = 0;
        float[] pw = new float[w.length];
        for(int i=0;i<pw.length;i++){
            pw[i] = p[i]/w[i];
        }
        PriorityQueue<items> pq = new PriorityQueue<>((a,b)-> Float.compare(b.profitPerWeight,a.profitPerWeight) );
        for(int i=0;i<pw.length;i++){
            pq.add(new items(p[i], w[i], pw[i]));
        }
        while(!pq.isEmpty()){
            items item = pq.remove();
            if(maxCapacity >= item.weight){
                totalProfit += item.profit;
                maxCapacity -= item.weight;
            }else{
                totalProfit += (maxCapacity/item.weight)*item.profit;
                break;
            }
        }
        return totalProfit;
    }
    public static void main(String[] args) {
        float[] p = new float[] { 20, 10, 20, 50 };
        float[] w = new float[] { 10, 15, 20, 35 };
        float maxCapacity = 60;
        float profit = Knapshak(p,w,maxCapacity);
        System.out.println("max profit : "+profit);
    }
}
