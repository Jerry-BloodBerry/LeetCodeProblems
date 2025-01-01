import java.util.stream.IntStream;

class Solution {
    public int missingNumber(int[] nums) {
        int sum = IntStream.of(nums).parallel().sum();
        int n = nums.length;
        int arithmeticSum = n * (n + 1) >> 1;
        return arithmeticSum - sum;
    }

    public int missingNumber2(int[] nums) {
        int res = nums.length;

        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }

        return res;
    }
}