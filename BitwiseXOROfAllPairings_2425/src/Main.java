public class Main {
    public static void main(String[] args) {
        int[] nums1 = {2,1,3};
        int[] nums2 = {10,2,5,0};
        Solution solution = new Solution();
        int res = solution.xorAllNums(nums1, nums2);
        System.out.printf("Result: %d", res);
    }
}
