public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        Solution solution = new Solution();
        double result = solution.findMaxAverage(nums, k);
        System.out.println(result);
    }
}