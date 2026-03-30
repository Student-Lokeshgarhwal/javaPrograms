import java.util.ArrayList;
import java.util.Arrays;

public class permutation {
    public static void permute(int[] arr,ArrayList<Integer> list,boolean[] used){
        if(list.size() == arr.length){
            System.out.println(list);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i] == arr[i-1] && !used[i-1])continue;
            if(used[i]) continue;
            if((list.size()==0) || (list.get(list.size()-1) != arr[i])){
                list.add(arr[i]);
                used[i] = true;
            }else continue;
            permute(arr,list,used);
            list.remove(list.size()-1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1,2 };
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        permute(arr, list, new boolean[arr.length]);
    }
}
