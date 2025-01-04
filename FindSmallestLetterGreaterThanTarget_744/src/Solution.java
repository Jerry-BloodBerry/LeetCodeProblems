class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int lo = 0;
        int hi = n - 1;
        char res = letters[0];
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (letters[mid] > target) {
                hi = mid - 1;
                res = letters[mid];
            } else {
                lo = mid + 1;
            }
        }
        return res;
    }
}