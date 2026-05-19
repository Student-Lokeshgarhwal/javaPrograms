public class countStr {
    public static long countSubstrings(String s, char c) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(c == s.charAt(i)){
                count++;
            }
        }
        long n1 = 0;
        long n = 0;
        for(int i=1;i<=count;i++){
            n = (i*i)-n1;
            n1 = n;
        }
        return n;
    }
    public static void main(String[] args) {
        long res = countSubstrings("abada", 'a');
        System.out.println(res);
    }
}