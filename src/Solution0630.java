import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution0630 {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b)->a[1] - b[1]);
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b)-> b-a);
        int t = 0;
        for(int[] c: courses) {
            int d = c[0];
            int l = c[1];
            t+=d;
            if(t<=l) q.add(d);
            else if(q.size()>0 && q.peek()>d) {
                t-=q.poll();
                q.add(d);
            }
            else t-=d;
        }
        return q.size();
    }
}
