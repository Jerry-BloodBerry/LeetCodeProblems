import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] digits = {0};
        Solution solution = new Solution();
        int[] res = solution.plusOne(digits);
        System.out.println(Arrays.toString(res));
    }
}
