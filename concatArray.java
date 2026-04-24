public class concatArray {
    public static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[2*length];
        for(int i=0;i<length;i++){
            ans[i] = nums[i];
            ans[i+length] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] num = {1,3,2,1};
        num = getConcatenation(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}