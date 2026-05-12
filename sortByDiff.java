import java.util.*;

public class sortByDiff {

    public static int minimumEffort(int[][] tasks) {

        Arrays.sort(tasks, (a, b) ->
            (b[1] - b[0]) - (a[1] - a[0])
        );

        int ans = 0;
        int curr = 0;

        for (int[] task : tasks) {

            int actual = task[0];
            int minimum = task[1];

            if (curr < minimum) {

                ans += (minimum - curr);

                curr = minimum;
            }

            curr -= actual;
        }

        return ans;
    }

    public static void main(String[] args) {

        sortByDiff obj = new sortByDiff();

        int[][] tasks = {
            {1, 3},
            {2, 4},
            {10, 11},
            {10, 12},
            {8, 9}
        };

        int result = obj.minimumEffort(tasks);

        System.out.println(
            "Minimum Initial Energy = " + result
        );
    }
}