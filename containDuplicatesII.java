import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class containDuplicatesII {
     public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 1) return false;
        Map<Integer,Integer> map = new HashMap<>();
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            if(!(map.containsKey(nums[i]))){
                map.put(nums[i],i);
            }else{
                temp = map.get(nums[i]);
                temp = Math.abs(i-temp);
                if(temp <= k){return true;}
                else{
                    map.put(nums[i],i);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array! ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in array ");
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int k;
        System.out.println("Enter the value of K! ");
        k = sc.nextInt();
        boolean res = containsNearbyDuplicate(arr, k);
        System.out.println(res);
    }
}
