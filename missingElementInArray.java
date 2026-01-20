import java.util.Scanner;

public class missingElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array! ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        int sum=0,total=0;
        System.out.println("Enter elements in array..");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        for(int i=1;i<=size+1;i++){
            total += i;
        }
        int missingNo = total-sum;
        System.out.println("Missing element in the array is : "+ missingNo);
    }
}
