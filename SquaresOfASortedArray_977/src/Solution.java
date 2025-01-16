class Solution {
    public int[] sortedSquares(int[] nums) {
        int minIndex = 0;
        int minIndexValue = Math.abs(nums[minIndex]);
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < minIndexValue) {
                minIndex = i;
                minIndexValue = Math.abs(nums[i]);
            }
        }
        int[] res = new int[nums.length];
        int left = minIndex - 1;
        int right = minIndex + 1;
        int current = 0;
        res[current] = minIndexValue * minIndexValue;
        current++;
        while (left >= 0 && right < nums.length) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                res[current] = nums[left] * nums[left];
                left--;
            } else {
                res[current] = nums[right] * nums[right];
                right++;
            }
            current++;
        }
        while (left >= 0) {
            res[current] = nums[left] * nums[left];
            left--;
            current++;
        }
        while (right < nums.length) {
            res[current] = nums[right] * nums[right];
            right++;
            current++;
        }

        return res;
    }
}