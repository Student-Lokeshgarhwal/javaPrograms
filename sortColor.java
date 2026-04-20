import java.util.Scanner;

public class sortColor {
    public static void sortColors(int[] nums) {
        int one=-1;
        int two = nums.length;
        int temp;
        for(int i = 0;i<two;i++){
            if(nums[i] == 2){
                two--;
                while(nums[two] == 2){
                    if(i == two) return;
                    two--;
                }
                temp = nums[i];
                nums[i] = nums[two];
                nums[two] = temp;
            }
            if(nums[i] == 0){
                one++;
                temp = nums[i];
                nums[i] = nums[one];
                nums[one] = temp;
            }
        }
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
        sortColors(arr);
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}