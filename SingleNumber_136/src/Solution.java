public class Solution {

    // We use the following XOR properties to solve this challenge
    // a ^ 0 = a
    // a ^ b = b ^ a
    // a ^ b ^ b ^ a ^ c = c
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        int sum = 0;
        for (int num : nums) {
            sum = sum ^ num;
        }
        return sum;
    }
}
