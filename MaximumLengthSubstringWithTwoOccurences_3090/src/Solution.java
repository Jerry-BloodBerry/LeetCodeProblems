class Solution {
    public int maximumLengthSubstring(String s) {
        int[] trackMap = new int[26];
        int left = 0;
        int right = 0;
        int currentLength = 0;
        int maxLength = 0;
        while (right < s.length())
        {
            if (trackMap[s.charAt(right) - 'a'] == 2) {
                maxLength = Math.max(currentLength, maxLength);
                while (trackMap[s.charAt(right) - 'a'] == 2) {
                    trackMap[s.charAt(left) - 'a']--;
                    left++;
                    currentLength--;
                }
            }
            trackMap[s.charAt(right) - 'a']++;
            currentLength++;
            right++;
        }
        return Math.max(currentLength, maxLength);
    }
}