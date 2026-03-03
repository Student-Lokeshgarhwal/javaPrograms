import java.util.Scanner;
import java.util.Stack;

public class reverseSubString {
    public static String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        String tempStr = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                tempStr = sb.toString();
                stack.push(tempStr);
                tempStr = "";
                sb.setLength(0);
            }else if(s.charAt(i) == ')'){
                tempStr = sb.reverse().toString();
                sb.replace(0,sb.length(),stack.peek() + tempStr);
                stack.pop();
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String! ");
        String str = sc.next();
        String res = reverseParentheses(str);
        System.out.println(res);
    }
}
