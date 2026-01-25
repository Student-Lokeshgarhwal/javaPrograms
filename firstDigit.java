import java.util.Scanner;

public class firstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer value");
        int n = sc.nextInt();
        int number = n;
        while (number / 10 != 0) {
            number = number / 10;
        }
        System.out.println("The first digit of integer value is : "+number);
        return;
    }
}
