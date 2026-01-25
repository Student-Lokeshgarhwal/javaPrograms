import java.util.Scanner;

public class factorial {
    static int getFactorial(int n){
        if(n == 0) return 1;
        return n*getFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get factorial ");
        int number = sc.nextInt();
        int factorial = getFactorial(number);
        System.out.println("Factorial of given "+number+" is "+ factorial);
    }
}
