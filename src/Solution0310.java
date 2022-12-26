import java.util.*;

public class Solution0310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n==1) return Arrays.asList(0);
        List<Integer>[] map = new LinkedList[n];
        for(int i = 0;i<n;i++) map[i] = new LinkedList();
        for(int[] edge:edges) {
            map[edge[0]].add(edge[1]);
            map[edge[1]].add(edge[0]);
        }
        HashSet<Integer> q = new HashSet<>();
        for(int i=0;i<n;i++) {
            if(map[i].size()==1) q.add(i);
        }
        int sum = q.size();
        while(sum<n){
            HashSet<Integer> tmp = new HashSet<>();
            for(Integer i:q) {
                int p = map[i].remove(0);
                map[p].remove(Integer.valueOf(i));
                if(map[p].size()==1) {
                    tmp.add(p);
                    sum++;
                }
            }
            q = tmp;

        }
        return new ArrayList<>(q);

    }
}
