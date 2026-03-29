// find all combination of number from 1 to n with size k.
import java.util.ArrayList;
import java.util.List;

public class backtrackingIII {

   public static void solve(int n,int k,int i,List<List<Integer>> list,List<Integer> templist){
      if((templist.size() > k) || (n-i+1) < (k-templist.size()) ) return;
      if(templist.size() == k){
         list.add(new ArrayList<>(templist));
         return;
      }
      templist.add(i);
      solve(n, k, i+1, list, templist);
      templist.remove(templist.size()-1);
      solve(n, k, i+1, list, templist);
      return;
   }

   public static List<List<Integer>> combine(int n, int k) {
      List<List<Integer>> list = new ArrayList<>();
      solve(n,k,1,list,new ArrayList<>());
      return list;
    }
   public static void main(String[] args) {
      List<List<Integer>> list = combine(4,2);
      for(List<Integer> l : list){
         System.out.println(l+" ");
      }
   }
}