import java.util.HashMap;
import java.util.Map;

public class ceaserCipherPairs {
    public static long countPairs(String[] words) {
        if(words.length == 1) return 0;
        // if(words[0].length() == 1){
        //    return (words.length*(words.length-1) /2);
        // }
        Map<String,Integer> map = new HashMap<>();
        StringBuilder finalStr = new StringBuilder();
        long pair = 0;
        String str = ""; 
        String pattern;
        int first,second,diff;
        int count = 0;
        for(int t=0;t<words.length;t++){
            str = words[t];
            for(int i=0;i<str.length()-1;i++){
                first = str.charAt(i);
                second = str.charAt(i+1);
                if(first > second) first -= 26;
                diff = Math.abs(first-second);
               finalStr.append(diff);
               finalStr.append(",");
            }
            pattern = finalStr.toString();
            finalStr.setLength(0);
            count = map.getOrDefault(pattern,0);
            if(count == 0) map.put(pattern,1);
            else{
                pair += count;
                map.put(pattern, count+1);
            }
        }
    return pair;
    }
    public static void main(String[] args) {
        String[] nums =  {"fusion","layout"};
        long res = countPairs(nums);
        System.out.println(res);
    }
}