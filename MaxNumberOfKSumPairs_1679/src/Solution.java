import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        int res = 0;
        for (int num: nums) {
            int temp = numsMap.getOrDefault(k - num, 0);
            if (temp > 0) {
                numsMap.put(k - num, temp - 1);
                res++;
            } else {
                numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
            }
        }
        return res;
    }

    public int maxOperations2(int[] nums, int k) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }
        var iterator = numsMap.entrySet().iterator();
        while (iterator.hasNext())
        {
            var entry = iterator.next();
            int key = entry.getKey();
            int cnt = entry.getValue();

            int compliment = k - key;
            int complimentCnt = numsMap.getOrDefault(compliment, 0);
            if (key == compliment) {
                res += cnt / 2;
            } else {
                res += Math.min(cnt, complimentCnt);
            }

            iterator.remove();
        }

        return res;
    }

    public int maxOperations3(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int cnt = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                cnt++;
                left++;
                right--;
            } else if (sum > k) {
                right--;
            } else {
                left++;
            }
        }
        return cnt;
    }
}