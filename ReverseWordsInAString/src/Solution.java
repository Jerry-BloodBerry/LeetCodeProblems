class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) != ' ') {
                int end = i;
                int start = end;
                while (i >= 0 && s.charAt(i) != ' ') {
                    start--;
                    i--;
                }
                for (int j = start + 1; j <= end; j++) {
                    sb.append(s.charAt(j));
                }
                sb.append(' ');
            } else {
                i--;
            }
        }
        return sb.toString().trim();
    }
}