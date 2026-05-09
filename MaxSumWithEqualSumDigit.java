import java.util.HashMap;
import java.util.Map;

public class MaxSumWithEqualSumDigit {
    public static int maximumSum(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       int num = 0;
       int n;
       int max = -1;
       int val;
       for(int i = 0;i<nums.length;i++){
        num=0;
        n = nums[i];
        while(n>0){
            num += n%10;
            n = n/10;
        }
        //  System.out.println(num);
        if(map.containsKey(num)){
            // System.out.println(num);
            val = map.get(num);
            if((val+nums[i]) > max){
                max = val+nums[i];
            }
            if(nums[i]>val) map.put(num,nums[i]);
        }else{
            map.put(num,nums[i]);
        }
       }
       return max;
    }
    public static void main(String[] args) {
        int[] num = {18,43,36,13,7};
        int res = maximumSum(null);
        System.out.println(res);
    }
}