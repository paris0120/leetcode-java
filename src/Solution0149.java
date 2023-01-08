import java.util.HashMap;

public class Solution0149 {
    public int maxPoints(int[][] points) {
        if(points.length<2) return points.length;
        HashMap<Integer, Integer>[] m = new HashMap[points.length];
        int o = 0;
        for(int i = 0;i<points.length;i++) {
            m[i] = new HashMap<>();
            for(int j=0;j<i;j++) {
                int k = 1;
                if(points[i][1] != points[j][1]) k = (points[i][0] - points[j][0])*1000000/(points[i][1] - points[j][1]);
                int c = 1;
                if(m[j].containsKey(k)) c+=m[j].get(k);
                m[i].merge(k, c, (a, b)->a>b?a:b);
                if(o<c) o = c;
            }
        }
        return o+1;
    }
}
