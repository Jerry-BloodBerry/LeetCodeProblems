import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] code = {2, 4, 9, 3};
        int k = -2;
        Solution solution = new Solution();
        int[] res = solution.decrypt(code, k);
        System.out.println(Arrays.toString(res));
    }
}