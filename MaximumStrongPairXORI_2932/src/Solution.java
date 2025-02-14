class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int maxXor = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int abs = Math.abs(nums[i] - nums[j]);
                int min = Math.min(nums[i], nums[j]);
                if (abs <= min && (nums[i] ^ nums[j]) > maxXor) {
                    maxXor = nums[i] ^ nums[j];
                }
            }
        }
        return maxXor;
    }
}