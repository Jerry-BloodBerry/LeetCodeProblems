public class Main {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        Solution sol = new Solution();
        int countPref = sol.prefixCount(words, pref);
        System.out.printf("%d words prefixed with \"%s\"\n", countPref, pref);
    }
}
