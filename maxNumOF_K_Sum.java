import java.util.Scanner;

public class maxNumOF_K_Sum {

     public static int maxOperations(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= k)
                nums[i] = 0;
        }
        System.out.println();
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (nums[i] != 0 && i<j)
                i++;
            while (nums[j] == 0 && j>i)
                j--;
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        i = 0;
        int op = 0;
        for (; i < j; i++) {
            if (nums[i] != 0) {
                for (int b = i + 1; b <= j; b++) {
                    if (nums[i] + nums[b] == k) {
                        op += 1;
                        nums[i] = nums[b] = 0;
                        break;
                    }
                }
            }
        }
        return op;
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
        System.out.println("Enter K value! ");
        int k= sc.nextInt();
        int res = maxOperations(arr, k);
        System.out.println(res);
    }
}
