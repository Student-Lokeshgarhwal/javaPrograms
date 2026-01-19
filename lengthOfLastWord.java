public class lengthOfLastWord {

     public static int lengthOfLastWord(String s) {
     String s1 = s.trim();
    //  String s1 = s.replaceAll("\\s+"," ");
     int count=0;
     for(int i=s1.length()-1;i>=0;i--){
        if(s1.charAt(i) == ' ') return count;
        count++;
     }   
     return count;
    }

    public static void main(String[] args) {
     String str = " lokesh     ji    garhwal    kumar     ";   
     int res = lengthOfLastWord(str);
     System.out.println(res);
    }
}
