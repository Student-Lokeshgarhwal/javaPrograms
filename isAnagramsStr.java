import java.util.Scanner;

public class isAnagramsStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string! ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string! ");
        String str2 = sc.nextLine();

        if (str1.length() == str2.length()) {
            int pos = 0;
            int[] str1Arr = new int[26];
            int[] str2Arr = new int[26];

            for (int i = 0; i < str1.length(); i++) {
                pos = str1.charAt(i) - 97;
                str1Arr[pos] = str1Arr[pos] + 1;
            }
            for (int i = 0; i < str2.length(); i++) {
                pos = str2.charAt(i) - 97;
                str2Arr[pos] = str2Arr[pos] + 1;
            }
            int i = 0;
            while (i < 26) {
                if (str1Arr[i] != str2Arr[i]) {
                    System.out.println("Both strings are not anagrams!");
                    return;
                }
                i++;
            }
            System.out.println("Both strings are anagrams!");
        } else {

            System.out.println("Both strings are not anagrams!");
        }

    }
}
