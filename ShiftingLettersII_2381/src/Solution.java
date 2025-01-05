class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] finalShifts = new int[s.length() + 1];
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2] == 1 ? 1 : -1;
            // here we are building a prefix sum array tracking how many shifts we need to make
            // cumulatively for each element without updating
            // each and every index
            finalShifts[start] += direction;
            finalShifts[end + 1] -= direction;
        }
        char[] chars = s.toCharArray();
        int cumulativeShift = 0;
        for (int i = 0; i < s.length(); i++) {
            cumulativeShift += finalShifts[i];
            chars[i] = (char)cycleChar(s.charAt(i) + cumulativeShift);
        }
        return new String(chars);
    }

    private int cycleChar(int charCode) {
        return ((charCode - 97) % 26 + 26) % 26 + 97;
    }
}