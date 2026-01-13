public class isSubStrPresent {

     public static int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int size = i+needle.length();
                if(size > haystack.length()) return -1;
                if(haystack.substring(i,i+needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String stringOne = "LEETCODE";
        String stringTwo = "LEET";

        int result = strStr(stringOne,stringTwo);
        if(result == -1){
            System.out.println(stringTwo+" is not present or a part of "+stringOne);
        }else{
            System.out.println(stringTwo+" is present or a part of "+stringOne);
        }
    }
}
