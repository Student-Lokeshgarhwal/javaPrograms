import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class isContainsDuplicates {

     public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i] , 1);
        }

        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array!");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements!");
        for(int i=0;i< size;i++){
            arr[i] = sc.nextInt();
        }
        boolean res = containsDuplicate(arr);
        System.out.println(res);
    }
}
