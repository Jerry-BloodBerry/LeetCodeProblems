public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        int midIndex = (left + right + 1) / 2;
        int mid = nums[midIndex];
        while (left != right) {
            mid = nums[midIndex];
            if (mid == target) {
                break;
            }
            if (mid < target) {
                left = midIndex;
            } else {
                right = midIndex - 1;
            }
            midIndex = (left + right + 1) / 2;
        }
        if (mid == target) {
            return midIndex;
        }
        if (nums[right] < target) {
            return right + 1;
        }
        return right == 0 ? 0 : right - 1;
    }
}