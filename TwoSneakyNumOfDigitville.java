import java.util.HashSet;
import java.util.Set;

public class TwoSneakyNumOfDigitville {
    public static int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        int index=0;
        for(int i : nums){
            if(set.contains(i)){
                res[index++] = i;
                if (index == 2) return res;
                }
            set.add(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] num = {0,3,2,1,3,2};
        num = getSneakyNumbers(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}