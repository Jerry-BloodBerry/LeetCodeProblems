public class Main {
    public static void main(String[] args) {
        String s = "dztz";
        int[][] shifts = {{0, 0, 0}, {1, 1, 1}};
        Solution sol = new Solution();
        String result = sol.shiftingLetters(s, shifts);
        System.out.println(result);
    }
}
