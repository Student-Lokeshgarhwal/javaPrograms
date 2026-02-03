public class placeFlower {
     public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int tempsum = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            tempsum += flowerbed[i];
        }
        if (tempsum == 0) {
            if (n <= flowerbed.length - (flowerbed.length / 2))
                return true;
            else
                return false;
        }
        int prev = 0;
        int next = 0;
        int i = 0;
        int count1 = 0;
        int sum = 0;
        while (i < flowerbed.length) {
            if (i - 1 >= 0)
                sum += flowerbed[i - 1];
            if (i + 1 < flowerbed.length)
                sum += flowerbed[i + 1];
            sum += flowerbed[i];
            if (sum == 0) {
                if (i - 1 >= 0) {
                    i = i - 1;
                    if (i - 1 >= 0)
                        sum += flowerbed[i - 1];
                    if (i + 1 < flowerbed.length)
                        sum += flowerbed[i + 1];
                    sum += flowerbed[i];
                    if (sum == 0) {
                        count1++;
                        i = i + 2;
                        continue;
                    } else {
                        i = i + 1;
                        sum = 0;
                    }
                }
                count1++;
            }
            if (i + 1 == flowerbed.length - 1) {
                if (sum != 0) {
                    sum = 0;
                    i = i + 1;
                    if (i - 1 >= 0) {
                        sum += flowerbed[i - 1];
                        sum += flowerbed[i];
                    }
                    if (sum == 0) {
                        count1++;
                    }
                }
            }
            sum = 0;
            i = i + 2;
        }

        if (count1 >= n)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        boolean res = canPlaceFlowers(new int[]{0,0,1,0,1,0,0,0,0,0,1,0,1,0},3);
        System.out.println(res);
    }
}
