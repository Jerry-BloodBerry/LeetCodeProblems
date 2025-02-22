public class Main {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        Solution solution = new Solution();
        boolean result = solution.isSubsequence(s, t);
        System.out.println(result ? "Is Subsequence" : "Is Not Subsequence");
    }
}