
import java.util.*;

public class reverseArray {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;     
        System.out.println("Enter the size of the Array! ");
        size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements in array..");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int low=0,high=size-1;
        while(low<high){
            arr[low]=arr[low]+arr[high];
            arr[high]=arr[low]-arr[high];
            arr[low]=arr[low]-arr[high];
            low++;
            high--;
        }

         for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
