public class Main {
    public static void main(String[] args) {
        int[] nums = { 3,2,5,4 };
        int threshold = 5;
        Solution solution = new Solution();
        int result = solution.longestAlternatingSubarray(nums, threshold);
        System.out.println(result);
    }
}