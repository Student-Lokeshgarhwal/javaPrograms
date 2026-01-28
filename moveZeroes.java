import java.util.Scanner;

public class moveZeroes {

    public static void moveZeroes(int[] nums) {
        int x=0;
        int i=0;
        int count = 0;
        while(i<nums.length){
            if(nums[i] != 0){
                nums[x] = nums[i];
                x++;
            }else{
                count++;
            }
            i++;
        }
        for(int j = x;j<nums.length;j++){
            nums[j] = 0;
        }
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
        moveZeroes(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
