import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums1Set = new HashSet<>();
        HashSet<Integer> resSet = new HashSet<>();
        for (var num : nums1) {
            nums1Set.add(num);
        }
        for (var num : nums2) {
            if (nums1Set.contains(num)) {
                resSet.add(num);
            }
        }
        int[] res = new int[resSet.size()];
        int i = 0;
        for (var elem : resSet) {
            res[i] = elem;
            i++;
        }
        return res;
    }
}