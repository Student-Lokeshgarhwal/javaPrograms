public class medianSortedArrays {
    public static void findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int[] nums3 = new int[nums1.length + nums2.length];
        while(i < nums1.length && j < nums2.length ){
            if(nums1[i] < nums2[j]){
                nums3[k] = nums1[i];
                i++;k++;
            }else{
                nums3[k] = nums2[j];
                j++;k++;
            }
        }
        while(i < nums1.length){
            nums3[k] = nums1[i];
            i++;k++;
        }
        while(j < nums2.length){
            nums3[k] = nums2[j];
            j++;k++;
        }
        if((nums3.length-1)%2==0){
            double result = nums3[(nums3.length-1)/2];
            System.out.println(result);
        }else{
            double result = (nums3[(nums3.length-1)/2]+nums3[((nums3.length-1)/2)+1])/2.0;
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        findMedianSortedArrays(new int[]{2,5,7}, new int[]{1,3,5,98});
    }
}
