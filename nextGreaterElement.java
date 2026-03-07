import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElement {
     public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        int[] resArr = new int[nums1.length];
        int x = 0;
        for(int i : nums2){
            while((stack.size() > 0) && stack.peek() < i){
                map.put(stack.pop(),i);
            }
            stack.push(i);
        }
        for(int i : nums1){
            resArr[x++] =  map.getOrDefault(i,-1);
        }
        return resArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arrays!");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        System.out.println("Enter elements of first array!");
        for(int i=0;i< size;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of second array!");
        for(int i=0;i< size;i++){
            arr2[i] = sc.nextInt();
        }
        int[] res = nextGreaterElement(arr1, arr2);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}
