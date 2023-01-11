import java.util.LinkedList;
import java.util.List;

public class Solution1443 {
    List<Integer>[] m ;
    List<Boolean> hasApple;
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        m = new LinkedList[n];
        this.hasApple = hasApple;
        for(int i = 0;i<hasApple.size();i++) m[i] = new LinkedList<>();
        for(int[] e:edges) {
            m[e[0]].add(e[1]);
            m[e[1]].add(e[0]);
        }
        int v = mv(0, 0);

        return v==0?0:v-2;
    }

    public int mv(int n, int last){
        int o = 0;
        for(int nxt:m[n]) {
            if(nxt==last) continue;
            int num = mv(nxt, n);
            if(num>0) o+=num;
        }
        if(o==0) return hasApple.get(n)?2:0;
        return o+2;
    }
}
