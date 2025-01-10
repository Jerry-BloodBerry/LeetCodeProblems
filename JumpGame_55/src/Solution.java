class Solution {

    /**
     * This method works but is quite slow compared to second version and uses more memory
     */
    public boolean canJump(int[] nums) {
        return jump(0, nums, new boolean[nums.length]);
    }

    private boolean jump(int currentIndex, int[] nums, boolean[] visited) {
        if (currentIndex == nums.length - 1) {
            return true;
        }
        int distance = Math.min(nums.length - 1 - currentIndex, nums[currentIndex]);
        while (distance > 0) {
            if (currentIndex + distance < nums.length && !visited[currentIndex + distance] && jump(currentIndex + distance, nums, visited)) {
                return true;
            }
            distance--;
        }
        visited[currentIndex] = true;
        return false;
    }

    /**
     * This version is optimal as it runs in O(n) time and needs O(1) space
     */
    public boolean canJump2(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}