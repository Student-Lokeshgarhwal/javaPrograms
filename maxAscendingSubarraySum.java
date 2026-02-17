import java.util.Scanner;

public class maxAscendingSubarraySum {
     public static int maxAscendingSum(int[] nums) {
        if(nums.length == 1) return nums[0];
        int max = 0;
        int tempMax = 0;
        for(int i = 0;i<nums.length-1;i++){
            tempMax = nums[i];
            while(nums[i] < nums[i+1]){
                tempMax+=nums[i+1];
                i++;
                if(i==nums.length-1) break;
            }
            if(tempMax > max){
                max = tempMax;
            }
        }
        return max;
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
        int res = maxAscendingSum(arr);
        System.out.println(res);
    }
}
