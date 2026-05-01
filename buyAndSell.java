import java.util.Stack;

public class buyAndSell {
    public static int maxProfit(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.push(prices[0]);
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < stack.peek() || (i==0 && prices[i] <= stack.peek())) {
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[i] < prices[j]) {
                        if (prices[j] - prices[i] > max)
                            max = prices[j] - prices[i];
                    }
                }
                stack.push(prices[i]);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] num = {7,1,5,3,6,4};
        int res = maxProfit(num);
        System.out.println(res);
    }
}
