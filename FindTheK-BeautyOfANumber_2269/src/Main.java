public class Main {
    public static void main(String[] args) {
        int num = 430043, k = 2;
        Solution solution = new Solution();
        int kBeauty = solution.divisorSubstrings(num, k);
        System.out.println(kBeauty);
    }
}