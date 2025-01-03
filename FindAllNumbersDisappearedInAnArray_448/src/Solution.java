import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] flags = new boolean[nums.length];
        for (int num : nums) {
            flags[num - 1] = true;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < flags.length; i++) {
            if (!flags[i]) {
                res.add(i + 1);
            }
        }
        return res;
    }

    public List<Integer> findDisappearedNumbers2(int[] nums) {
        // This does not use extra space. We negate the numbers we found in the array to mark them. We then know that
        // only the positive numbers (those that were not marked) are the ones that are missing
        List<Integer> res = new ArrayList<>();
        for (int num: nums) {
            nums[Math.abs(num) - 1] = -Math.abs(nums[Math.abs(num) - 1]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
}