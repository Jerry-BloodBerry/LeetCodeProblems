class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int res = 0;
        if (nums1.length % 2 == 0 && nums2.length % 2 == 0) {
            return res;
        } else if (nums1.length % 2 == 0) {
            for (int num : nums1) {
                res ^= num;
            }
            return res;
        } else if (nums2.length % 2 == 0) {
            for (int num : nums2) {
                res ^= num;
            }
            return res;
        } else {
            for (int num : nums1) {
                res ^= num;
            }
            for (int num : nums2) {
                res ^= num;
            }
        }
        return res;
    }
}