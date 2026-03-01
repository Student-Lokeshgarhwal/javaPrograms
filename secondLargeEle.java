import java.util.*;

public class secondLargeEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the Array! ");
        size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements in array..");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        if (size < 2) {
            System.out.println("Not enough size of array for secondLargest element");
            return;
        }
        int largest = arr[arr.length-1];
        int secondLargest = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                if(arr[i] != largest){
                    secondLargest = arr[i];
                }
            }
        }
        if (secondLargest == -1) {
            System.out.println("No any second largest element in array");
            return;
        }

        System.out.println("The second Large element in array is :" + secondLargest);
    }
}
