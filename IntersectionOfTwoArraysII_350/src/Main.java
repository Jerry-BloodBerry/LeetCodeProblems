import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        Solution solution = new Solution();
        int[] intersection = solution.intersect(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }
}
