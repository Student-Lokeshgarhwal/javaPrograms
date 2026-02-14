import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class increasingTripletSubsequence {

     public static boolean increasingTriplet(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(set.size() < 3)return false;
        int max=0;
        int j=1;
        int count = 0;
        boolean res = false;
        for(int i = 0;i<nums.length-2;i++){
            j = i+1;
            count = 1;
            max = nums[i];
        while(j<nums.length){
            if(nums[j] > max){
                max = nums[j];
                count++;
            }
            if(nums[j] < max && nums[j] > nums[i]){
                max = nums[j];
            }
            if(count == 3){
                res = true;
                break;
            }
            j++;
        }
        if(res) break;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array! ");
        int size= sc.nextInt();
        System.out.println("Enter elements of array! ");
        int[] arr = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        boolean res = increasingTriplet(arr);
        System.out.println(res);
    }
}
