import java.util.HashSet;
import java.util.Set;

public class MaxVowelsInSubstring {
    public static int maxVowels(String s, int k) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int vowel = 0;
        int res = 0;
        if(s.length() == 1 && set.contains(s.charAt(0))) return 1;
        String subStr = s.substring(0,k);
        for(int i=0;i<subStr.length();i++){
            if(set.contains(s.charAt(i))) vowel++;
        }
        res = vowel;
        int i=0;
        int j=k-1;
        while(j<s.length()-1){
            if(set.contains(s.charAt(i))) vowel--;
            i++;
            j++;
            if(set.contains(s.charAt(j))) vowel++;
            if(vowel == k) return k;
            if(vowel>res) res = vowel;
        }
        return res;
    }
    public static void main(String[] args) {
        int res = maxVowels("abiicsdeilcqz",3);
        System.out.println(res);
    }
}