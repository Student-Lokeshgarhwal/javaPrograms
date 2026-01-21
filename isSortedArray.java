import java.util.*;

public class isSortedArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of an Array!");
        size = sc.nextInt();
        int[] array = new int[size];

        int i=0;
        while(i<size){
            array[i] = sc.nextInt();
            i++;
        }

        for(int j=0;j<size-1;j++){
            if(array[j]>array[j+1]){
                System.out.println("Array is not in sorted order!");
                return;
            }
        }
        System.out.println("Array is sorted!");
        
    }
}