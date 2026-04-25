import java.util.HashSet;
import java.util.Set;

public class prefixCommOfTwoArr {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans = new int[A.length];
        Set<Integer> set = new HashSet<>();
        int count;
        for(int i = 0;i<A.length;i++){
            set.add(A[i]);
            count = 0;
            for(int j=0;j<=i;j++){
                if(set.contains(B[j])) count++;
            }
            ans[i] = count;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};
        A = findThePrefixCommonArray(A, B);
        for(int j=0;j<A.length;j++){
            System.out.print(A[j]+" ");
        }
    }
}