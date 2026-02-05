public class isSubsequence {

    static public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        if(s.length() != 0 && t.length() == 0) return false;
        StringBuffer sb = new StringBuffer(t);
        int i = 0;
        while(i<s.length()){
            if(sb.indexOf(s.charAt(i)+"") == -1){
                return false;
            }else{
                sb = sb.delete(0, sb.indexOf(s.charAt(i)+"")+1);
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "adsbfgsdc";
       boolean res = isSubsequence(s, t);
       System.out.println(res);
    }
}
