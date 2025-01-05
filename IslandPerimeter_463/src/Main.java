public class Main {
    public static void main(String[] args) {
        int[][] grid = {{1, 0}};
        Solution sol = new Solution();
        int perimeter = sol.islandPerimeter(grid);
        System.out.printf("Perimeter: %d%n", perimeter);
    }
}
