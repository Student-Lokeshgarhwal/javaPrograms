import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class longestPalindrome {
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int count = 0;
        int temp = -1;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                if (entry.getValue() % 2 != 0) {
                    if (temp == 0) {
                        count--;
                    }
                    temp = 0;
                }
                count += entry.getValue();

            } else {
                if (temp != 0) {
                    temp = 1;
                }
            }
        }
        if (temp == 1)
            return count + temp;
        else
            return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        int result = longestPalindrome(str);
        System.out.println(result);
    }
}
