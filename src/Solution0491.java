import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution0491 {
    Set<List<Integer>> o = new HashSet<>();
    int[] nums;
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> s = new ArrayList<>();
        this.nums = nums;
        find(s, 0);
        return new ArrayList<>(o);
    }
    public void find(List<Integer> s, int i) {
        if(i==nums.length) {
            if(s.size()>1)  o.add(new ArrayList<>(s));
            return;
        }
        if(s.size()==0 || s.get(s.size()-1)<=nums[i]) {
            s.add(nums[i]);
            find(s, i+1);
            s.remove(s.size()-1);
        }
        find(s, i+1);
    }
}
