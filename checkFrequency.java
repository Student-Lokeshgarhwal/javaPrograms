import java.util.Scanner;

public class checkFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the Array! ");
        size = sc.nextInt();
        char[] arr = new char[size];
        int[] arrInt = new int[26];
        char[] arrChar = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R','S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

        System.out.println("Enter characters in the array..");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next().charAt(0);
        }

        int i = 0, pos = 0;
        while (i < size) {
            pos = arr[i] - 97;
            arrInt[pos] = arrInt[pos] + 1;
            i++;
        }

        for (int j = 0; j < 26; j++) {
            if (arrInt[j] != 0) {
                System.out.println(arrChar[j] + " = " + arrInt[j]);
            }
        }
    }
}
