import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class removeStarsFromStr {
    public static String removeStars(String s) {
        List<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int i = -1;
        for(char ch : s.toCharArray()){
            if(ch != '*'){
                i++;
                list.add(ch);
            }else{
                list.remove(i);
                i--;
            }
        }
        for(char ch : list){
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("description -- Remove the closest non-star character to its left, as well as remove the star itself.");
        System.out.println("Enter String! (ex - leet**cod*e)");
        String str = sc.next();
        String res = removeStars(str);
        System.out.println(res);
    }
}
