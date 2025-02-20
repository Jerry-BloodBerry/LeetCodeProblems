class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pref = new int[nums.length];
        int[] suff = new int[nums.length];
        pref[0] = 1;
        suff[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            pref[i] = pref[i-1] * nums[i - 1];
            suff[i] = suff[i-1] * nums[nums.length - i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = pref[i] * suff[nums.length - i - 1];
        }
        return nums;
    }

    public int[] productExceptSelf2(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = 1;
        }
        int left = 1;
        int right = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] *= left;
            left *= nums[i];
            res[nums.length - i - 1] *= right;
            right *= nums[nums.length - i - 1];
        }
        return res;
    }
}