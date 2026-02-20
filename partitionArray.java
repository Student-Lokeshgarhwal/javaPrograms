import java.util.Scanner;

public class partitionArray {

     public static int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int x1 = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] < pivot){
                arr[x1++] = nums[i];
            }
        }
        int x2 = nums.length-1;
        for(int i = nums.length-1;i>=0;i--){
            if(nums[i] > pivot){
                arr[x2--] = nums[i];
            }
        }
        while(x2 >= x1){
            arr[x2--] = pivot;
        }
        return arr;
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
        System.out.println("Enter value to calculate array! ");
        int pivot= sc.nextInt();
        int[] res = pivotArray(arr,pivot);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}
