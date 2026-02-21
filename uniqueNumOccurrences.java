import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class uniqueNumOccurrences{

     public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(!(set.contains(entry.getValue()))) set.add(entry.getValue());
            else return false;
        }
        return true;
    }

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

        boolean res = uniqueOccurrences(arr);
        System.out.println(res);
    }
}