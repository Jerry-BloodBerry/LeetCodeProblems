import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>(words1.length);
        int[] bmax = new int[26];
        for (String b : words2) {
            var counts = count(b);
            for (int i = 0; i < counts.length; i++) {
                bmax[i] = Math.max(bmax[i], counts[i]);
            }
        }
        search: for (var word : words1) {
            var counts = count(word);
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] < bmax[i]) {
                    continue search;
                }
            }
            res.add(word);
        }
        return res;
    }

    private int[] count(String s) {
        int[] counts = new int[26];
        for (var c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        return counts;
    }
}