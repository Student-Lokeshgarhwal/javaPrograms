import java.util.Arrays;
import java.util.Scanner;

public class longestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if(nums.length < 2) return nums.length;
        Arrays.sort(nums);
        int i = 0;
        int j = i+1;
        int tempSeq=1;
        int sequence = 0;
        while(j<nums.length){
            if(nums[i] == nums[j]){
            }else if(nums[i]+1 == nums[j]){
                tempSeq++;
            }else{
                if(tempSeq > sequence) sequence = tempSeq;
                tempSeq = 1;
            }
                i++;
                j++;
        }
        if(tempSeq > sequence) sequence = tempSeq;
        return sequence;
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
        int res = longestConsecutive(arr);
        System.out.println(res);
    }
}
