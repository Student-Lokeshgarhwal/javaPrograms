import java.util.Scanner;

public class missingNumber {
    
    public static int missingNumber(int[] nums) {
        int total = 0;
        int arrSum = 0;
        for(int i=0;i<=nums.length;i++){
            if(i!=nums.length){
                arrSum += nums[i];
            }
            total += i+1;
        }
        return total-arrSum;
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
        int result = missingNumber(arr);
        System.out.println(result);
    }
}
