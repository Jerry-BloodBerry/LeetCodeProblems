import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        for (var num : nums) {
            if (!numsSet.add(num)) {
                return true;
            }
        }
        return false;
    }
}