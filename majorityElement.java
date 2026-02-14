import java.util.Arrays;
import java.util.Scanner;

public class majorityElement {
      public static int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
       Arrays.sort(nums);
       int count=0;
       int tempCount = 1;
       int res = 0;
       for(int i = 0;i<nums.length-1;i++){
        if(nums[i] == nums[i+1]){ 
            tempCount ++;
        }else{
            if(tempCount > count){
            count = tempCount;
            res = nums[i];
            tempCount = 1;
            }
        }
        if(tempCount >= count){res = nums[i];}
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
        int res = majorityElement(arr);
        System.out.println("Majority Element : "+res);
    }
}
