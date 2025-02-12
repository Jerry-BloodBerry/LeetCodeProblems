class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int right = 0;
        int whiteBlockCount = 0;
        int minBlockCount = k;
        while (right < blocks.length())
        {
            if (right - left == k) {
                if (whiteBlockCount < minBlockCount) {
                    minBlockCount = whiteBlockCount;
                }
                if (blocks.charAt(left) == 'W') {
                    whiteBlockCount--;
                }
                left++;
            }
            if (blocks.charAt(right) == 'W') {
                whiteBlockCount++;
            }
            right++;
        }
        if (right - left == k && whiteBlockCount < minBlockCount) {
            minBlockCount = whiteBlockCount;
        }
        return minBlockCount;
    }
}