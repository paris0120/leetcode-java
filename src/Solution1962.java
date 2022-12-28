import java.util.PriorityQueue;

public class Solution1962 {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b)->b-a);
        int o = 0;
        for(int p:piles) {
            q.add(p);
            o+=p;
        }
        for(;k>0;k--) {
            int m = q.poll();
            int r = m/2;
            o-=r;
            q.add(m-r);
        }

        return o;
    }
}
