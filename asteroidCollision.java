import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class asteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stackPositive = new Stack<>();
        Stack<Integer> stackNegative = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int[] tempArr = new int[asteroids.length];
        int index = 0;
        int tempNum;
        for(int i : asteroids){
            if(i>=0){
                stackPositive.push(i);
            }else{
                stackNegative.push(i);
                while((!(stackPositive.isEmpty())) && (!(stackNegative.isEmpty()))){
                    if(stackPositive.peek() > Math.abs(stackNegative.peek())){
                        stackNegative.pop();
                    }else if(stackPositive.peek() == Math.abs(stackNegative.peek())){
                        stackPositive.pop();
                        stackNegative.pop();
                    }
                    else stackPositive.pop();
                }
                    if(stackPositive.isEmpty() && (!(stackNegative.isEmpty()))){
                    list.add(stackNegative.peek());
                    stackNegative.pop();
                }
            }
        }
        while(stackPositive.size() > 0){
            tempArr[index++] = stackPositive.pop();
        }
        index--;
        while(index>=0){
            list.add(tempArr[index--]);
        }
        int[] resArr = new int[list.size()];
        for(int i :list){
            resArr[++index] = i;
        }
        return resArr;
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
        int[] res = asteroidCollision(arr);
        for(int i = 0;i<size;i++){
            System.out.println(res[i]);
        }
    }
}
