import java.util.Scanner;

public class sumOfIntegerValue {
    public static void main(String[] args) {
        int n;
        int sum =0;
        System.out.println("Enter any integer value!");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n != 0) {
            sum += n%10;
            n = n/10;
        }
        System.out.println("Sum is : "+ sum);
    }
}
