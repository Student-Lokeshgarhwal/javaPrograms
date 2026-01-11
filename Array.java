import java.util.*;
public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length! ");
        int length = sc.nextInt();
        
        int[] array = new int[length];   //declearation

        System.out.println("Enter array elements! ");
        for(int n=0;n<length;n++){
            array[n] = sc.nextInt();       //initialization
        } 

        int sum =0;

        for(int i=0;i<length;i++){
            System.out.print(array[i] + " ");       //access
            sum = sum + array[i];
        }    
        System.out.println();
        System.out.println("Sum : "+sum);   

        int max = array[0];
        for(int i=1;i<length;i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println("Max : "+max);   

        System.out.println("Reverse : ");   
        for(int i=length-1;i>=0;i--){
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(array));
        int[] arr = {1,2,3,4};
        Arrays.fill(arr,1,3,5);
        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
        int Sum = Arrays.stream(arr).sum();
        System.out.println(Sum);

        int[] copy = Arrays.copyOf(arr, 3);
        for(int n : copy){
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println(Arrays.hashCode(arr));
        System.out.println(Arrays.hashCode(copy));
        Arrays.setAll(copy,i->copy[i]*copy[i]);
        for(int n : copy){
            System.out.print(n + " ");
        }
        System.out.println();


    }
}