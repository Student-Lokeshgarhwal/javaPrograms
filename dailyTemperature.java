import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class dailyTemperature {
    public static int[] dailyTemperatures(int[] temperatures) {
        if(temperatures.length == 1){
            return new int[]{0};
        }
        Stack<Integer> stack = new Stack<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] returnArray = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peek()) {
                if (map.containsKey(stack.peek())) {
                    map.get(stack.pop()).add(i);
                } else {
                    map.put(stack.peek(), new ArrayList<>());
                    map.get(stack.pop()).add(i);
                }
            }
            stack.push(temperatures[i]);
        }
        for(int i=0;i<temperatures.length; i++){
            if(map.containsKey(temperatures[i]) && map.get(temperatures[i]).size()>0){
            returnArray[i] = map.get(temperatures[i]).get(0) - i;
            map.get(temperatures[i]).remove(0);
             System.out.println(temperatures[i]);
            }
        }
        return returnArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array! ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in array ");
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = dailyTemperatures(arr);
        for(int i : res){
            System.out.print(i+" ");
        }
    }
}
