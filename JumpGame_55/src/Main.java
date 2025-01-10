public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 1, 4};
        Solution sol = new Solution();
        System.out.printf("%s", sol.canJump2(nums) ? "Possible to reach last index" : "Impossible to reach last index");
    }
}
