import java.util.Arrays;
import java.util.HashMap;

public class Solution2389 {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] qs = Arrays.copyOf(queries, queries.length);
        Arrays.sort(qs);
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int c = 0;
        int nn = 0;
        for(int qn=0;qn<queries.length;qn++) {
            int q = qs[qn];
            while(q>=sum && nn<=nums.length) {
                if(nn==nums.length) {
                    nn = nums.length+1;
                    break;
                }
                sum+=nums[nn];
                nn++;
            }
            map.put(q, nn-1);
        }
        int[] a = new int[queries.length];
        for(int i = 0;i<a.length;i++) {
            a[i] = map.get(queries[i]);
        }
        return a;
    }
}
