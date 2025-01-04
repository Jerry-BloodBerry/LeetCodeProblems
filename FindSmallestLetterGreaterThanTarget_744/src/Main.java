public class Main {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        Solution solution = new Solution();
        char smallestLetterGreaterThanTarget = solution.nextGreatestLetter(letters, target);
        System.out.println(smallestLetterGreaterThanTarget);
    }
}
