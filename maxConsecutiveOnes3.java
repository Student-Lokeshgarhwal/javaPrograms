import java.util.Scanner;

public class maxConsecutiveOnes3 {

     public static int longestOnes(int[] nums, int k) {
        if(k == nums.length) return k;
        int i = 0;
        int j = i;
        int countZero = 0;
        int max = 0;
        int tempMax = 0;
        boolean reachEnd = false;
        while(i<nums.length){
            while(nums[j] == 1 || countZero <= k){
                if(nums[j] == 0){
                    if(countZero == k){
                        break;
                    }
                     countZero++;
                }
                tempMax++;
                if(j == nums.length-1){
                    reachEnd = true;
                    break;
                }
                j++;
            }
            if(tempMax > max) max = tempMax;
            if(reachEnd) break;
            if(nums[i] == 1){
            while(nums[i] == 1){
                tempMax--;
                i++;
            }
            }else{
            tempMax--;
            countZero--;
            i++;
            }
        }
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
        System.out.println("Enter number to convert 0s! ");
        int K= sc.nextInt();
        int res = longestOnes(arr,K);
        System.out.println(res);
    }
}
