public class Solution {
    // This is an implementation of the Boyer-Moore majority voting algorithm
    public int majorityElement(int[] nums) {
        int counter = 0;
        int majorityElement = 0;

        for (int num : nums) {
            if (counter == 0) {
                majorityElement = num;
                counter = 1;
            } else if (num == majorityElement) {
                ++counter;
            } else {
                --counter;
            }
        }

        return majorityElement;
    }
}