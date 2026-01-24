public class reverseStrWithoutSpace {
    public static void reverseString(char[] s) {
        int length = s.length;
        int i = 0,j = length-1;
        char temp;
        while(i<j){
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        for(char x : s){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        char[] str = {'A','L','G','O','R','I','T','H','M'};
        reverseString(str);
    }
}
