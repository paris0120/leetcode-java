import java.util.HashMap;

public class Solution0128 {

    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int m = 0;
        for(int n:nums) {
            int b = n;
            int e = n;
            if(map.containsKey(n)) continue;
            map.put(n,n);
            if(map.containsKey(n+1)) e = map.get(n+1);
            if(map.containsKey(n-1)) b = map.get(n-1);
            map.put(e, b);
            map.put(b, e);
            System.out.println(n + "," + b+","+e);
            m = m>e-b?m:e-b;
        }
        return m+1;
    }
}
