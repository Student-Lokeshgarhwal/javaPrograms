import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class isTwoStringsClose {

     public static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<word1.length();i++){
            char temp = word1.charAt(i);
            map1.put(temp,map1.getOrDefault(temp,0)+1);
        }
        for(int i=0;i<word2.length();i++){
            char temp = word2.charAt(i);
            map2.put(temp,map2.getOrDefault(temp,0)+1);
        }
        if(map1.size() != map2.size()) return false;
        for(Map.Entry<Character,Integer> entry : map1.entrySet()){
            if(!(map2.containsKey(entry.getKey()))) return false;
        }
        for(Map.Entry<Character,Integer> entry : map1.entrySet()){
            if(!(map2.containsValue(entry.getValue()))) return false;
            for(Map.Entry<Character,Integer> value : map2.entrySet()){
                if(entry.getValue() == value.getValue()){
                    map2.put(value.getKey(),0);
                    break;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String! ");
        String str1 = sc.nextLine();
        System.out.println("Enter 2nd String! ");
        String str2 = sc.nextLine();
        boolean res = closeStrings(str1, str2);
        System.out.println(res);
    }
}
