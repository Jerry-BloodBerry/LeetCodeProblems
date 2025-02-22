import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'a', 'b', 'b', 'a', 'a'};
        Solution solution = new Solution();
        int res = solution.compress(chars);
        System.out.println(res);
        System.out.println(Arrays.toString(chars));
    }
}