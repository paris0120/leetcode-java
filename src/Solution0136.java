import java.util.HashSet;

public class Solution0136 {
    public int singleNumber(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int n:nums) if(!s.add(n)) s.remove(n);
        return s.iterator().next();
    }
}
