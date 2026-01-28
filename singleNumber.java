public class singleNumber {
    
    public static int singleNumber(int[] nums) {
        int temp = 0;
        for(int i=0;i<nums.length;i++){
           temp ^= nums[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] array = {2,3,1,6,4,2,1,6,3};
        int result = singleNumber(array);
        System.out.println(result);
    }
}
