import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class strLength{
    int idx;
    int length;
    strLength(int idx,int length){
        this.idx = idx;
        this.length = length;
    }
}
public class RearrangeWord {
    public static String arrangeWords(String text) {
       PriorityQueue<strLength> pq = new PriorityQueue<>(
    Comparator.comparingInt((strLength x) -> x.length)
              .thenComparingInt(x -> x.idx)
);
        text = text.toLowerCase();
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<=text.length();i++){
            if(i == text.length() || text.charAt(i) == ' '){
                list.add(new StringBuilder(sb));
                pq.add(new strLength(list.size()-1,sb.length()));
                sb.setLength(0);
            }else{
                sb.append(text.charAt(i));
            }
        }
        while(!pq.isEmpty()){
        sb.append(list.get(pq.poll().idx));
        // System.out.println(sb);
            if(!pq.isEmpty()) sb.append("_");
        }
        String s = sb.toString();
        s=s.replace("_"," ");
        s = s.substring(0,1).toUpperCase()+s.substring(1);
        return s;
    }
    public static void main(String[] args) {
        String str = arrangeWords("Leetcode is cool");
        System.out.println(str);
    }
}