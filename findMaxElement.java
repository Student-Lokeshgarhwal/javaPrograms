import java.util.*;

public class findMaxElement {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of rows");
       int rows = sc.nextInt();
       System.out.println("Enter number of columns");
       int columns = sc.nextInt();
       int[][] twoarr = new int[rows][columns];
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
        System.out.println("Enter element of "+ i+","+ j +" column");
            twoarr[i][j] = sc.nextInt();
        }
    }

    int max = twoarr[0][0];

     for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            if(max < twoarr[i][j]){
                max = twoarr[i][j];
            }
            System.out.print(twoarr[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("Max element : "+ max);
    System.out.println(Arrays.deepToString(twoarr));
}
}
