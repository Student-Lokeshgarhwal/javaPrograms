import java.util.ArrayList;

public class backtracking {
   static void R(int[] arr,int i,ArrayList<Integer> list){
      if(i==arr.length){ System.out.println(list); return;}
      list.add(arr[i]);
      R(arr, i+1, list);     //include
      list.remove(list.size()-1);       //backtracking
      R(arr,i+1,list);       //exclude
      }
   public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      int[] ar = {1,2,3};
     R(ar, 0,list);
   }

}
