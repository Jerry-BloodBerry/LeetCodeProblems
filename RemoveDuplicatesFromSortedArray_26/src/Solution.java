public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 1) {
            return nums.length;
        }
        int previous = nums[0];
        int ind = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != previous) {
                nums[ind] = nums[i];
                previous = nums[ind];
                ind++;
            }
        }
        return ind;
    }
}
