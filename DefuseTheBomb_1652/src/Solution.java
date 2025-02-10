class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];
        if (k == 0) {
            return ans;
        }
        int left, right;
        if (k > 0) {
            left = 1 % code.length;
        } else {
            left = code.length + k;
        }
        right = left;
        int sum = 0;
        int current = 0;
        while (distance(left, right, code.length) < Math.abs(k) - 1) {
            sum += code[right];
            right = (right + 1) % code.length;
        }
        while (current < code.length) {
            sum += code[right];
            right = (right + 1) % code.length;
            ans[current] = sum;
            sum -= code[left];
            left = (left + 1) % code.length;
            current++;
        }

        return ans;
    }

    private int distance(int left, int right, int codeLength) {
        if (right >= left) {
            return right - left;
        }
        return codeLength - left + right;
    }
}