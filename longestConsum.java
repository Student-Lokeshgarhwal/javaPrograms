public class longestConsum {
    public static void main(String[] args) {
        int k = 9;
        int[] array = {2,3,5,3,1,5};
        int left = 0;
        int rigth = 0;
        int sum = 0;
        int tempSUm = 0;
        int maxLength = 0;
        int start = 0;
        int end = 0;
        while (rigth<array.length) {
            tempSUm += array[rigth];
            if(tempSUm > k){
                while(left <= rigth && tempSUm > k){
                    tempSUm = tempSUm - array[left];
                    left++;
                }
            }
            if(tempSUm > sum){
                sum = tempSUm;
                start = left;
                end = rigth;
                maxLength = rigth-left+1;
            }
            rigth++;
        }
        System.out.println("max Length : "+maxLength);
        System.out.println("sum : "+sum);
        System.out.println("start : "+start);
        System.out.println("end : "+end);
    }
}
