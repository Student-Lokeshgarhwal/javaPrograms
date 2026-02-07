import java.util.ArrayList;
import java.util.List;

public class isBecomeHighest {
    public static void isbecomehighest(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int highest = candies[0];
        for (int i : candies) {
            if (i > highest) {
                highest = i;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= highest)
                result.add(true);
            else
                result.add(false);
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i)+" ");

        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 2, 4 };
        isbecomehighest(arr, 2);
    }
}
