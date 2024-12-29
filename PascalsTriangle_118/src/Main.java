public class Main {
    public static void main(String[] args) {
        int numRows = 5;
        Solution solution = new Solution();
        var result = solution.generate(numRows);
        for (var l : result) {
            for (var e : l) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
