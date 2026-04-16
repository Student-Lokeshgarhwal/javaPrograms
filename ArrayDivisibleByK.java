import java.util.Scanner;

public class ArrayDivisibleByK {
    public static int minOperations(int[] nums, int k) {
        int sum = 0;int count = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        if(sum < k){
            return sum;
        }else if(sum % k == 0){
            return 0;
        }else{
            while(!(sum%k==0)){
                count++;
                sum -= 1;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of an Array!");
        size = sc.nextInt();
        int[] array = new int[size];

        int i=0;
        System.out.println("Enter elements");
        while(i<size){
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Enter value of K");
        int k = sc.nextInt();
        int res = minOperations(array, k);
        System.out.println(res);
    }
}