import java.util.HashMap;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] n1Counts = new int[1001];
        int[] n2Counts = new int[1001];
        int minLength = Math.min(nums1.length, nums2.length);
        int i = 0;
        while (i < minLength) {
            n1Counts[nums1[i]]++;
            n2Counts[nums2[i]]++;
            i++;
        }
        while (i < nums1.length) {
            n1Counts[nums1[i]]++;
            i++;
        }
        while (i < nums2.length) {
            n2Counts[nums2[i]]++;
            i++;
        }
        i = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int resSize = 0;
        while (i < n1Counts.length) {
            if (n1Counts[i] > 0 && n2Counts[i] > 0) {
                int val = Math.min(n1Counts[i], n2Counts[i]);
                map.put(i, val);
                resSize += val;
            }
            i++;
        }
        int[] res = new int[resSize];
        i = 0;
        for (int key : map.keySet()) {
            for (int j = 0; j < map.get(key); j++) {
                res[i] = key;
                i++;
            }
        }
        return res;
    }
}