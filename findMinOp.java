public class findMinOp {
    public static int minimumOperations(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 3 != 0) res++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] num = {4,3,7,6,1};
        int res = minimumOperations(num);
        System.out.println(res);
    }
}