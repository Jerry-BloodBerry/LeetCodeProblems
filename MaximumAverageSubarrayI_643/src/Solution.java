class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        while (right < nums.length) {
            if (right - left == k) {
                maxSum = Math.max(sum, maxSum);
                sum -= nums[left];
                left++;
            }
            sum += nums[right];
            right++;
        }
        if (right - left == k) {
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum / (double) k;
    }
}