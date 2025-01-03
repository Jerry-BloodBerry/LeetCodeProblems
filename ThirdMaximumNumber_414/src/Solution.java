class Solution {
    public int thirdMax(int[] nums) {
        long[] maximums = new long[3];
        for (int i = 0; i < 3; i++) {
            maximums[i] = Long.MIN_VALUE;
        }
        int countDistinct = 0;
        for (int num : nums) {
            if (num > maximums[0]) {
                long temp = maximums[0];
                long temp2 = maximums[1];
                maximums[0] = num;
                maximums[1] = temp;
                maximums[2] = temp2;
                countDistinct++;
            } else if (num > maximums[1] && num < maximums[0]) {
                long temp = maximums[1];
                maximums[1] = num;
                maximums[2] = temp;
                countDistinct++;
            } else if (num > maximums[2] && num < maximums[1]) {
                maximums[2] = num;
                countDistinct++;
            }
        }
        return countDistinct >= 3 ? (int) maximums[2] : (int) maximums[0];
    }
}