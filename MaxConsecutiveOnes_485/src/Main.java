public class Main {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        Solution sol = new Solution();
        int maxConsecutiveOnes = sol.findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
    }
}
