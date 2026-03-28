import java.util.ArrayList;
import java.util.HashSet;
// strictly increasing order allowed
public class backtrackingII {
     static void inc(int[] a,int i,ArrayList<Integer> list,int prev){
      if(i == a.length){
         System.out.println(list);
         return;
      }
      if(a[i] > prev){
         list.add(a[i]);
         inc(a, i+1, list, a[i]);
         list.remove(list.size()-1);
      }
      inc(a, i+1, list, prev);
   }
   public static void main(String[] args) {
       int[] a = {1,21,3,61};
       ArrayList<Integer> list = new ArrayList<>();
      inc(a,0,list,Integer.MIN_VALUE);
   }
}
