import java.util.Scanner;

public class reverseVowel {

     public static String reverseVowels(String s) {
        String str = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = sb.length()-1;
        boolean temp1 = true;
        boolean temp2 = true;
        while(i<= j){
            if(!(str.contains(String.valueOf(sb.charAt(i))))){
                i++;
                temp1 = false;
            }
            if(!(str.contains(String.valueOf(sb.charAt(j))))){
                j--;
                temp2 = false;
            }
            if(temp1 && temp2){
                char x = sb.charAt(i);
                sb = sb.replace(i,i+1,String.valueOf(sb.charAt(j)));
                sb = sb.replace(j,j+1,String.valueOf(x));
                i++;j--;
            }
            temp1 = true;
            temp2 = true;
        }
        return sb.toString();
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String! ");
        String str = sc.nextLine();
        String res = reverseVowels(str);
        System.out.println(res);
    }
}
