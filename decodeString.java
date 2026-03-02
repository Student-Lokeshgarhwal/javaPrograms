import java.util.Scanner;
import java.util.Stack;

public class decodeString {

     public static String decodeString(String s) {
       Stack<Integer> countStack = new Stack<>();
       Stack<String> stringStack = new Stack<>();
       int i = 0;
       int k = 0;
       String tempStr = "";
       String tempStr2 = "";
       while(i<s.length()){
        if(s.charAt(i) >= '0' && s.charAt(i) <= '9') k = (k*10) + (s.charAt(i)-'0');
        else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') tempStr += s.charAt(i);
        else if(s.charAt(i) == '['){
            countStack.push(k);
            stringStack.push(tempStr);
            k = 0;
            tempStr = "";
        }else if(s.charAt(i) == ']'){
            for(int j=1;j<=countStack.peek();j++) tempStr2 += tempStr;
            tempStr = stringStack.peek() + tempStr2;
            countStack.pop();
            stringStack.pop();
            tempStr2 = "";
        }
        i++;
       }
       return tempStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter encoded String! (ex - 3[a]2[bc])");
        String str = sc.next();
        String res = decodeString(str);
        System.out.println(res);
    }
}
