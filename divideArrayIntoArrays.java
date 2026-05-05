import java.util.Arrays;

public class divideArrayIntoArrays{
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] result = new int[nums.length/3][3];
        int idx1 = 0;
        int idx2 = 0;
        int i = 0;
        int j=1;
        while(j<=nums.length){
            if(j%3==0){
                idx2 =0;
                if((nums[j-1] - nums[i]) <= k){
                    while(i<j){
                        result[idx1][idx2] = nums[i];
                        idx2++;
                        i++;
                    }
                    idx1++;  
                }else{
                    int[][] newresult = new int[0][0];
                    return newresult;
                }
            }
            j++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] num = {1,3,4,8,7,9,3,5,1};
        int k = 2;
        int[][] nums = divideArray(num, k);
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}