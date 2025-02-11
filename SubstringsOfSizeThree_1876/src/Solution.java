import java.util.HashSet;

class Solution {
    public int countGoodSubstrings(String s) {
        int left = 0;
        int right = 0;
        int res = 0;
        HashSet<Character> trackSet = new HashSet<>();
        while (right < s.length()) {
            if (right - left == 3) {
                res++;
                trackSet.remove(s.charAt(left));
                left++;
            }
            while (left < right && trackSet.contains(s.charAt(right))) {
                trackSet.remove(s.charAt(left));
                left++;
            }
            trackSet.add(s.charAt(right));
            right++;
        }
        if (right - left == 3) {
            res++;
        }
        return res;
    }
}