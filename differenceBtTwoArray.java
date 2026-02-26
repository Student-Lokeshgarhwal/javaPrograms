import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class differenceBtTwoArray {

     public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        for(int i : set1){
            if(!(set2.contains(i))){
                list1.add(i);
            }
        }
        for(int i : set2){
            if(!(set1.contains(i))){
                list2.add(i);
            }
        }
        list.add(list1);
        list.add(list2);
        return list;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the Arrays! ");
        size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        System.out.println("Enter elements in first array..");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements in second array..");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        List<List<Integer>> lists;
        lists = findDifference(arr1,arr2);
            for(List list : lists){
                System.out.println(list);
        }
    }
}
