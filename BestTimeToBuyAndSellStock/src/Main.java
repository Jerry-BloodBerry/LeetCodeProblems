public class Main {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        Solution solution = new Solution();
        int maxProfit = solution.maxProfit(prices);
        System.out.printf("Max profit is: %d\n", maxProfit);
    }
}
