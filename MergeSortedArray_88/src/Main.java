import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = nums2.length;
        Solution sol = new Solution();
        sol.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
