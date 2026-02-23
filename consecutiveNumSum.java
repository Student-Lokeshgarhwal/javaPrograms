import java.util.Scanner;

public class consecutiveNumSum {
    public static int consecutiveNumbersSum(int n) {
        int res = 0;
        for(int i = 1; i * i <= n; i++) {
        if(n % i == 0) {
            if(i % 2 == 1) res++;
            if((n / i) % 2 == 1 && i != n/i) res++;
        }
    }
       return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number! ");
        int n = sc.nextInt();
        int res = consecutiveNumbersSum(n);
        System.out.println(res);
    }
}
