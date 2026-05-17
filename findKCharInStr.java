public class findKCharInStr {
    public static char findK(StringBuilder str,int k){
        if(str.length() >= k)return str.charAt(k-1);
        int x = str.length();
        for(int i=0;i<x;i++){
        char c = (char)((str.charAt(i))+1);
        str.append(c);
        }
        return findK(str,k);
    }
    public static char kthCharacter(int k) {
        if (k == 1) return 'a';
        StringBuilder sb = new StringBuilder("a");
        return findK(sb,k);
    }
    public static void main(String[] args) {
        char ch = kthCharacter(5);
        System.out.println(ch);
    }
}
