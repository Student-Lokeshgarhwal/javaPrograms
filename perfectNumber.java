import java.util.Scanner;

public class perfectNumber {

    public static boolean checkPerfectNumber(int num) {
        int res = 0;
        for(int i = 1;i<=(num/2);i++){
            if(num%i == 0) res += i;
        }
        return (res == num) ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter Number! ");
        num = sc.nextInt();
        boolean res = checkPerfectNumber(num);
        System.out.println(res);
    }
}
