import java.util.Scanner;
import java.util.Stack;

public class reversePolishNotation {

     public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int num1 = 0;
        int num2 = 0;
        for(int i = 0;i<tokens.length;i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                stack.push(Integer.parseInt(tokens[i]));
            }else if((!(stack.isEmpty())) && tokens[i].equals("+")){
                num2 = stack.pop();
                num1 = stack.pop();
                stack.push(num1 + num2);
            }else if((!(stack.isEmpty())) && tokens[i].equals("-")){
                num2 = stack.pop();
                num1 = stack.pop();
                stack.push(num1 - num2);
            }else if((!(stack.isEmpty())) && tokens[i].equals("*")){
                num2 = stack.pop();
                num1 = stack.pop();
                stack.push(num1 * num2);
            }else if((!(stack.isEmpty())) && tokens[i].equals("/")){
                num2 = stack.pop();
                num1 = stack.pop();
                stack.push(num1 / num2);
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the Array! ");
        size = sc.nextInt();
        String[] arr = new String[size];

        System.out.println("Enter elements in array..");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
        }
        int res = evalRPN(arr);
        System.out.println(res);
    }
}
