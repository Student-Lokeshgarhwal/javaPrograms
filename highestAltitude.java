public class highestAltitude {

     public static int largestAltitude(int[] gain) {
        int[] tempArr = new int[gain.length+1];
        tempArr[0] = 0;
        int sum = 0;
        int highest = 0;
        for(int i = 0;i<gain.length;i++){
            sum += gain[i];
            tempArr[i+1] = sum;
            if(tempArr[i+1] > highest){
                highest = tempArr[i+1];
            }
        }
        return highest;
    }

    public static void main(String[] args) {
        int res = largestAltitude(new int[]{3,-5,-2,7,3,-4,1,8,-3});
        System.out.println(res);
    }
}
