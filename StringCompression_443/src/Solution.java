class Solution {
    public int compress(char[] chars) {
        int left = 0;
        int strpointer = 0;
        while (left < chars.length) {
            int right = left;
            while (right < chars.length && chars[left] == chars[right]) {
                right++;
            }
            int diff = right - left;
            if (diff == 1) {
                chars[strpointer++] = chars[left++];
                continue;
            }
            chars[strpointer++] = chars[left];
            int numDigits = getNumDigits(diff);
            int end = strpointer - 1 + numDigits;
            int temp = end;
            while (temp >= strpointer) {
                chars[temp] = Character.forDigit(diff % 10, 10);
                diff /= 10;
                temp--;
            }
            strpointer = end + 1;
            left = right;
        }

        return strpointer;
    }

    private static int getNumDigits(int num) {
        int bound = 10;
        int numDigits = 1;
        while (num >= bound) {
            bound *= 10;
            numDigits++;
        }
        return numDigits;
    }
}