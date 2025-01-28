public class Main {
    public static void main(String[] args) {
        String s = "([])";
        Solution sol = new Solution();
        boolean isValid = sol.isValid(s);
        System.out.println(isValid ? "VALID" : "NOT VALID");
    }
}