import java.util.Stack;

public class validParanthesis {
    public static boolean isValid(String s) {
        char ch;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            ch = s.charAt(i);
            if(ch == '('|| ch == '{'||ch == '['){
                stack.push(ch);
            }
            else{
                if(ch == ')' && stack.peek() == '('){
                    stack.pop();
                }
                else if(ch == '}' && stack.peek() == '{'){
                    stack.pop();
                }
                else if(ch == ']' && stack.peek() == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean res = isValid("()");
        System.out.println(res);
    }
}
