public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,5};
        int target = 4;
        Solution solution = new Solution();
        int ans = solution.searchInsert(nums, target);
        System.out.println("Ans is: " + ans);
    }
}
