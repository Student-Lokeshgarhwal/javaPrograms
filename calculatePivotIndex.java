public class calculatePivotIndex {
     public static int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
        }
        System.out.println("Sum "+sum);
        int currentValue;
        int remaining;
        float half;
        float previous=0;
        int result = -1;
        for(int i=0;i<nums.length;i++){
          if(i != 0)  previous += nums[i-1];
         currentValue = nums[i];
         remaining = sum - currentValue;
         half = remaining /2.0f;
         System.out.println("s: "+sum+" p: "+previous+" h: "+half);
         if(previous == half){
            System.out.println("hii"+previous);
            result = i;
            break;
         } 
        }
        return result;
    }
    public static void main(String[] args) {
        int res = pivotIndex(new int[]{-1,-1,-1,-1,-1,-1});
        System.out.println(res);
    }
}
