import java.util.Scanner;

public class findMinMaxWithoutArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,min,max;
        int currentValue=0;
        System.out.println("Enter first number");
        n = sc.nextInt();
        min = n;
        max = n;
        while(true){
            System.out.println("1 -- enter value");
            System.out.println("2 -- quit");
            n = sc.nextInt();
            if(n == 2){
                 break;
            }else if(n==1){
                
            System.out.println("Enter number");
            currentValue = sc.nextInt();
            }else{
                continue;
            }
            if(currentValue<min) min = currentValue;
            if(currentValue>max) max = currentValue;
        }
        System.out.println("Minimum Value : "+min);
        System.out.println("Maximum Value : "+max);
    }
}