import java.util.Stack;

public class reverseWords {
     public static String reverseWords(String s) {
        char empty = ' ';
        if(s.length() == 1) return s;
         String str = s.trim();
         str = str.replaceAll("\\s+"," ");
        int i = 0;
        int j = str.length()-1;
        int start = 0;
        String substr="";
        
        String resultStr = "";
        Stack<String> stack = new Stack<>();
        while(i<=j){
           if(str.charAt(i) == empty || i == j){
            if(start != 0) stack.push(" ");
            substr = (i != j)? str.substring(start,i):str.substring(start,i+1);
            
            stack.push(substr);
            start = i+1;
           }
           i++;
        }
        while(!stack.isEmpty()){
            resultStr += stack.peek();
            stack.pop();
        }
        return resultStr;
    }
    public static void main(String[] args) {
        String res = reverseWords("   hello    world    ");
        System.out.println(res);
    }
}
