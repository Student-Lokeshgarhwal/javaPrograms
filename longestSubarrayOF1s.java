import java.util.Scanner;

public class longestSubarrayOF1s {
     public static int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int max = 0;
        int tempMax = 0;
        int zeroCount = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                if (zeroCount == 0) {
                    zeroCount = 1;
                    left = right;
                } else {
                    if (tempMax > max) max = tempMax;
                    tempMax = right - left - 1;
                    left = right;
                }
            }else{
                tempMax = tempMax+1;
            }
                right++;
        }
        if(tempMax > max) max = tempMax;
        if(zeroCount == 0) max--;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array! ");
        int size= sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array! ");
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int res = longestSubarray(arr);
        System.out.println(res);
    }
}
