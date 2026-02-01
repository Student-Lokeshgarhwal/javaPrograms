import java.util.Scanner;

public class searchIndex {

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the Array! ");
        size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements in array..");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int target;
        System.out.println("Enter the target element to get the correct index in the Array! ");
        target = sc.nextInt();

        int res = searchInsert(arr, target);
        System.out.println("the correct index of "+target+ " should be "+res);
        System.out.println(res);
    }
}
