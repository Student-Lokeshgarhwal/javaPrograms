public class kSumPair {

   public static int maxOperations(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= k)
                nums[i] = 0;
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (nums[i] != 0 && i<j)
                i++;
            while (nums[j] == 0 && j>i)
                j--;
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        System.out.println(j);
        i = 0;
        int op = 0;
        for (; i < j; i++) {
            if (nums[i] != 0) {
                for (int b = i + 1; b <= j; b++) {
                    
                    if ((nums[i] + nums[b]) == k) {
                        op += 1;
                        nums[i] = nums[b] = 0;
                        break;
                    }
                }
            }
        }
        return op;
    }

    public static void main(String[] args) {
        int res = maxOperations(new int[] {3,1,3,4,3}, 5);
        System.out.println(res);
    }
}
