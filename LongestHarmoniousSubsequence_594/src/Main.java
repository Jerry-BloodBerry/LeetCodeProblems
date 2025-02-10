public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        Solution sol = new Solution();
        int res = sol.findLHS(nums);
        System.out.printf("Result is: %d", res);
    }
}