import java.util.LinkedList;
import java.util.List;

public class Solution1519 {
    int[] o;
    List<Integer>[] m;
    boolean[] v;
    String labels;
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        o = new int[labels.length()];
        v = new boolean[labels.length()];
        m = new LinkedList[labels.length()];
        for(int i = 0;i < m.length; i++) m[i] = new LinkedList<>();
        for(int[] e:edges) {
            m[e[0]].add(e[1]);
            m[e[1]].add(e[0]);
        }
        this.labels = labels;
        c(0);
        return o;
    }

    public int[] c(int i) {
        int[] c = new int[26];
        int p = labels.charAt(i)-'a';
        v[i] = true;
        c[p]++;
        for(int n:m[i]) {
            if(!v[n]) {
                int[] cn = c(n);
                for(int ci = 0;ci<26;ci++) c[ci]+=cn[ci];
            }
        }
        o[i] = c[p];
        return c;
    }
}
