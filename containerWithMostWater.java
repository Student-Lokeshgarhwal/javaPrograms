import java.util.Scanner;

public class containerWithMostWater {

     public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int elements = j;
        int sum = 0;
        int max = 0;
        int small = 0;
        while (i < j) {
            if (height[i] <= height[j]) {
                small = height[i];
                i++;
            } else {
                small = height[j];
                j--;
            }
                sum = small*elements;
                if (sum > max) {
                max = sum;
            }
            elements--;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array! ");
        int size= sc.nextInt();
        System.out.println("Enter elements of array! ");
        int[] arr = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int res = maxArea(arr);
        System.out.println(res);
    }
}
