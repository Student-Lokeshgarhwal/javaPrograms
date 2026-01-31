public class mergeStrAlternately {

     public static String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        String merged = "";
        while (i < word1.length() && j < word2.length()) {
                merged += word1.charAt(i);
                merged += word2.charAt(j);
                i++;
                j++;
            
        }
        while (i < word1.length()) {
            merged += word1.charAt(i);
            i++;
        }
        while (j < word2.length()) {
            merged += word2.charAt(j);
            j++;
        }
        return merged;
    }
    public static void main(String[] args) {
        String resultString = mergeAlternately("cyber", "security");
        System.out.println(resultString);
    }
}
