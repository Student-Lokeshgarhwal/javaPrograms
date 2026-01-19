import java.util.Scanner;

public class mergeTwoSortedArray {
     public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                nums3[k] = nums1[i];
                k++;i++;
            }else{
                nums3[k] = nums2[j];
                k++;j++; 
            }
        }
        while(i<m){
            nums3[k] = nums1[i];
            k++;i++;
        }
        while(j<n){
            nums3[k] = nums2[j];
            k++;j++;
        }
        System.out.println();
        for(int x=0;x<m+n;x++){
            System.out.print(nums3[x]+" ");
        }
    }

    public static void main(String[] args) {
        int m,n;
        System.out.println("Enter length of first array");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        System.out.println("Enter length of second array");
        n = sc.nextInt();
        int[] nums1 = new int[m];
        int[] nums2 = new int[n];
        System.out.println("Enter elements of first array");
        for(int i=0;i<m;i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of second array");
        for(int i=0;i<n;i++){
            nums2[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
             System.out.print(nums1[i]+" ");
        }
        System.out.println();
         for(int i=0;i<n;i++){
             System.out.print(nums2[i]+" ");
        }
        merge(nums1,m,nums2,n);
    }
}
