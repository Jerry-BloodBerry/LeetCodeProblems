import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        Solution sol = new Solution();
        int[] sortedSquares = sol.sortedSquares(nums);
        System.out.println(Arrays.toString(sortedSquares));
    }
}
