public class Main {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        Solution sol = new Solution();
        int searchResult = sol.search(nums, target);
        System.out.println(searchResult);
    }
}
