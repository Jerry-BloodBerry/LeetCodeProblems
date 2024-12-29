import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*
    * This function uses the fact that each element of the Pascal's triangle can be represented as the binomial coefficient
    * C(n,k) = n!/(k! * (n-k)!)
    * */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        if (rowIndex == 0) {
            return res;
        }
        for (int i = 1; i <= rowIndex; i++) {
            long newElem = (long) res.get(i - 1) * (rowIndex - i + 1) /i;
            res.add((int) newElem);
        }
        return res;
    }
}