class Solution {
    public int divisorSubstrings(int num, int k) {
        int left = 0;
        int right = k - 1;
        String numString = String.valueOf(num);
        int kBeauty = 0;
        while (right < numString.length()) {
            int subNum = extractSubnumber(num, numString.length(), left, right);
            if (subNum != 0 && num % subNum == 0) {
                kBeauty++;
            }
            left++;
            right++;
        }
        return kBeauty;
    }

    private int extractSubnumber(int num, int numLength, int start, int end)
    {
        int divider = (int) Math.pow(10, numLength - end - 1);
        num /= divider;
        num %= (int) Math.pow(10, end - start + 1);
        return num;
    }
}