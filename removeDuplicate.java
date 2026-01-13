import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,2,5,1,4,3,1,5,6,2,5,6,1};

        int length1 = arr.length;
        for(int i=0;i<length1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i : set){
            System.out.print(i+" ");
        }

        
        // int x = 0;
        // boolean flag;
        // int arr2[] = new int[length1];
        // for(int i=0;i<length1;i++){
        //     flag = true;
        //     if(i == 0){
        //         arr2[x] = arr[i];
        //     }
        //     else{
        //         for(int j=0;j<=x;j++){
        //             if(arr[i] == arr2[j]){
        //                 flag = false;
        //                 break;
        //             }
        //         }
        //         if(flag){
        //         x += 1;
        //         arr2[x] = arr[i];
        //         }
        //     }
        // }
        // for(int i=0;i<=x;i++){
        //     System.out.print(arr2[i]+" ");
        // }
    }
}
