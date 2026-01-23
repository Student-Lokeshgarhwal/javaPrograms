import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class wordSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        char[][] board = new char[3][3];
        System.out.println("Enter the characters in the 3 * 3 matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map.put(board[i][j], map.getOrDefault(board[i][j], 0) + 1);
            }
        }
        System.out.println("Your matrix :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter word to search in matrix");
        String word = sc.next();
        // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }
        int x = 0;
        boolean temp = false,res=false;
        for (int i = 0; i < word.length(); i++) {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (word.charAt(i) == entry.getKey() && entry.getValue() != 0){
                    x = entry.getValue() - 1;
                    map.put(entry.getKey(), x);
                    temp = true;
                    break;
                }
            }
            if (temp){
                res = true;
                temp = false;
            }
            else {
                res = false;
                break;
            }
        }
        System.out.println(res);
    }
}
