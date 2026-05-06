import java.util.Scanner;

class Solution {
    public boolean search(int i, int s, int e, int[][] matrix, int target) {
        if (s > e) return false;

        int mid = s + (e - s) / 2;

        if (matrix[i][mid] == target) {
            return true;
        }

        if (matrix[i][mid] > target) {
            return search(i, s, mid - 1, matrix, target);
        } else {
            return search(i, mid + 1, e, matrix, target);
        }
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;

        boolean res = false;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (matrix[i][0] > target) return false;

                if (matrix[i][0] == target || matrix[i][c - 1] == target)
                    return true;

                if (matrix[i][c - 1] > target) {
                    res = search(i, 0, c - 1, matrix, target);
                    if (res) return true;
                    break;
                } else {
                    break;
                }
            }
        }
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Input target
        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        Solution sol = new Solution();
        boolean result = sol.searchMatrix(matrix, target);

        // Output result
        if (result) {
            System.out.println("Target found in matrix.");
        } else {
            System.out.println("Target not found in matrix.");
        }

        sc.close();
    }
}