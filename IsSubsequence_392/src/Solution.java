class Solution {
    public boolean isSubsequence(String s, String t) {
        int strpointer = 0;
        int i = 0;
        while (i < t.length() && strpointer < s.length()) {
            if (s.charAt(strpointer) == t.charAt(i)) {
                strpointer++;
            }
            i++;
        }
        return strpointer == s.length();
    }
}