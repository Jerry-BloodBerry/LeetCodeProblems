import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = {"l", "e"};
        Solution sol = new Solution();
        List<String> result = sol.wordSubsets(words1, words2);
        System.out.println(result);
    }
}
