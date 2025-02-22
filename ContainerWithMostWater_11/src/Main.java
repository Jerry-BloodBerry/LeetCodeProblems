public class Main {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Solution sol = new Solution();
        int maxArea = sol.maxArea(height);
        System.out.println(maxArea);
    }
}