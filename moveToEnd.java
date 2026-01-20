import java.util.Scanner;

public class moveToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array! ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements in array..");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            if(arr[i] == 0){
                if(i != size-1){
                    int j=i+1;
                    while(arr[j] == 0){
                        if(j == size-1){
                            break;
                        }
                        j++;
                    }
                    if(arr[i] == arr[j]){break;}
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
