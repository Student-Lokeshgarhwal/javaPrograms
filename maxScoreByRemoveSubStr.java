public class maxScoreByRemoveSubStr {
    public static int maximumGain(String s, int x, int y) {
        int total = 0;
        StringBuilder sb = new StringBuilder();
        char first = (x>=y) ? 'a':'b';
        char second = (x>=y) ? 'b':'a';
        int i = 0;
        while (i < s.length()) {
           if(sb.length() == 0){sb.append(s.charAt(i++)); continue;}
           if(sb.charAt(sb.length()-1) == first && s.charAt(i) == second){
                total += (x >= y) ? x : y;
                // System.out.println(total);
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(s.charAt(i));
            }
            i++;
        }
        i=0;
        s = sb.toString();
        sb.setLength(0);
        while (i < s.length()) {
           if(sb.length() == 0){sb.append(s.charAt(i++)); continue;}
            if (sb.charAt(sb.length() - 1) == second && s.charAt(i) == first){
                total += (x >= y) ? y : x;
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(s.charAt(i));
            }
            i++;
        }
        System.out.println(total);
        return total;
    }
    public static void main(String[] args) {
        int res = maximumGain("cdbcbbaaabab", 4, 5);
        System.out.println(res);
    }

}
