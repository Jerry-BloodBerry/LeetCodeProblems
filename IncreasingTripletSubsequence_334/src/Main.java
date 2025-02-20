public class Main {
    public static void main(String[] args) {
        int[] nums = {2,1,5,0,4,6};
        Solution solution = new Solution();
        boolean hasIncreasingTriplet = solution.increasingTriplet(nums);
        System.out.println(hasIncreasingTriplet ? "Has Increasing Triplet" : "No Increasing Triplet");
    }
}