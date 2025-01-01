import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        int i = 0;
        int j;
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while (i < nums.length) {
            sb.append(nums[i]);
            i++;
            j = i;
            while (j < nums.length && nums[j] - nums[j-1] == 1) {
                j++;
            }
            if (j != i) {
                sb.append("->");
                sb.append(nums[j-1]);
            }
            i = j;
            res.add(sb.toString());
            sb.setLength(0);
        }
        return res;
    }
}