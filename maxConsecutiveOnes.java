import java.util.Scanner;

public class maxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int tempCount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]== 0){
                count = Math.max(count,tempCount);
                tempCount = 0;
            }else tempCount++;
        }
        return (tempCount > count)? tempCount: count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the Arrays! ");
        size = sc.nextInt();
        int[] arr1 = new int[size];

        System.out.println("Enter elements in first array..");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        int res = findMaxConsecutiveOnes(arr1);
        System.out.println(res);
    }
}
