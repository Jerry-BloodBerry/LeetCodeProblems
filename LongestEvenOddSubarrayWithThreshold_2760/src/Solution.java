class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int left = 0;
        while (left < nums.length && (nums[left] % 2 != 0 || nums[left] > threshold)) {
            left++;
        }
        int right = left + 1;
        int res = 0;
        while (right < nums.length) {
            if (nums[right] % 2 == nums[right - 1] % 2 || nums[right] > threshold) {
                if (right - left > res) {
                    res = right - left;
                }
                left = right;
                while (left < nums.length && (nums[left] % 2 != 0 || nums[left] > threshold)) {
                    left++;
                }
                right = left;
            }
            right++;
        }
        if (left < nums.length && nums[left] % 2 == 0 && right - left > res) {
            res = right - left;
        }
        return res;
    }
}