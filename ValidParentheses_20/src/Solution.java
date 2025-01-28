import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> mapping = new HashMap<>();
        HashSet<Character> opening = new HashSet<>(Set.of('(', '{', '['));
        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (opening.contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty() || stack.pop() != mapping.get(s.charAt(i))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}