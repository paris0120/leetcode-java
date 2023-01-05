import java.util.Arrays;

public class Solution0452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a, b)->a[0]==b[0]?0:a[0]<b[0]?-1:1);
        int e = points[0][1];
        int c = 1;
        for(int[] p:points) {
            if(p[0]<=e) e=Math.min(e, p[1]);
            else {
                c++;
                e = p[1];

            }

        }
        return c;
    }
}
