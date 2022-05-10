import java.util.ArrayList;
import java.util.List;

/**
 * 216. Combination Sum III
 * tc: O(1)
 * sc: O(1)
 */
public class Solution0216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        return get(k, n, 9);

    }

    public List<List<Integer>> get(int k, int n, int max) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        if(k == 1) {
            if(max>=n && n>=1) {
                List<Integer> o = new ArrayList<Integer>();
                o.add(n);
                output.add(o);
            }
        }
        else for(int i = k;i<=max;i++) {
            List<List<Integer>> t = get(k-1, n-i, i-1);
            for(List<Integer> l:t) {
                l.add(i);
                output.add(l);
            }
        }
        return output;
    }
}
