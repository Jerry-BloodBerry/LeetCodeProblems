public class Main {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        Solution sol = new Solution();
        var missingNumbers = sol.findDisappearedNumbers(nums);
        System.out.println(missingNumbers);
    }
}
