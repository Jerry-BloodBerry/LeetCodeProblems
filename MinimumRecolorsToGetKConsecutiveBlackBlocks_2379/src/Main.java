public class Main {
    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        Solution solution = new Solution();
        int result = solution.minimumRecolors(blocks, k);
        System.out.println(result);
    }
}