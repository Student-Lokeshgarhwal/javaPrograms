import java.util.Scanner;
import java.util.Stack;

public class validateStackSequence {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length == 1) return true;
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for(int i = 0;i<pushed.length;i++){
            stack.push(pushed[i]);
            while(stack.size() > 0 && (stack.peek() == popped[j])){
                stack.pop();
                j++;
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arrays! ");
        int size= sc.nextInt();
        System.out.println("Enter elements of array1! ");
        int[] arr1 = new int[size];
        for(int i = 0;i<size;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of array2! ");
        int[] arr2 = new int[size];
        for(int i = 0;i<size;i++){
            arr2[i] = sc.nextInt();
        }
        boolean res = validateStackSequences(arr1,arr2);
        System.out.println(res);
    }
}
