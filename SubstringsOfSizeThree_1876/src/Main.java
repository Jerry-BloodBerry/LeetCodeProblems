public class Main {
    public static void main(String[] args) {
        String s = "aababcabc";
        Solution solution = new Solution();
        int res = solution.countGoodSubstrings(s);
        System.out.println(res);
    }
}