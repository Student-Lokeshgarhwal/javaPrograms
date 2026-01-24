import java.util.Scanner;

public class firstNonRepeatChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String! ");
        String str = sc.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count += 1;
                    if (count == 2) {
                        break;
                    }
                }
            }
            if (count == 1) {
                System.out.println("First non repeating character in the string is :" + str.charAt(i));
                return;
            }
        }
        System.out.println("No any non-repeating element in string");
    }
}
