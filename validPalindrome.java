public class validPalindrome {

    public static boolean isPalindrome(String s) {
        String s2 = s.toLowerCase();
        String s3 = s2.replaceAll("\\s", "");
        String s4 = s3.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s4);
        int i=0,j = s4.length()-1;
        boolean res = true;
        while(i<j){
            if(s4.charAt(i) == s4.charAt(j)){
                i++;j--;
            }else{
                res = false;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = " bol lob";
       boolean result = isPalindrome(s);
       System.out.println(result);
       
    }
}
