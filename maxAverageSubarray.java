import java.util.Scanner;

public class maxAverageSubarray {
     public static void findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double avg = 0.0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        avg = sum/k;
        double tempAvg = 0.0;
        int j = 0;
        for(int i=1;i<=nums.length-k;i++){
            j = i+k-1;
            sum = sum-nums[i-1]+nums[j];
            tempAvg = sum/k;
            if(tempAvg > avg){
                avg = tempAvg;
            }
        }
        System.out.println(avg);
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
        System.out.println("Enter the size of the subarray!");
        int subarray = sc.nextInt();
        findMaxAverage(arr, subarray);
    }
}
