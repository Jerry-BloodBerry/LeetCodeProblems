import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int minDiff = 100001;
        int left = 0;
        int right = k - 1;
        while (right < nums.length) {
            int temp = nums[right] - nums[left];
            if (temp < minDiff) {
                minDiff = temp;
            }
            right++;
            left++;
        }
        return minDiff;
    }
}