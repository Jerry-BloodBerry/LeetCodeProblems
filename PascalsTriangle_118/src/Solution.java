import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(List.of(1)));
        if (numRows == 1) {
            return res;
        }
        for (int i = 1; i < numRows; i++) {
            res.add(new ArrayList<>());
            List<Integer> currentRow = res.get(i);
            currentRow.add(1);
            List<Integer> prevRow = res.get(i - 1);
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currentRow.add(1);
        }
        return res;
    }
}