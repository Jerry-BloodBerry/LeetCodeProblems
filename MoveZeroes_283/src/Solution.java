public class Solution {
    public void moveZeroes(int[] nums) {
        int firstZeroIndex = 0;
        while (firstZeroIndex < nums.length && nums[firstZeroIndex] != 0) {
            firstZeroIndex++;
        }
        for (int i = firstZeroIndex + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[firstZeroIndex] = nums[i];
                nums[i] = 0;
                firstZeroIndex++;
            }
        }
    }
}