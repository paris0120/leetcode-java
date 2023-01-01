import java.util.PriorityQueue;

public class Solution1834 {
    public int[] getOrder(int[][] tasks) {
        PriorityQueue<Integer> iq = new PriorityQueue<>((a, b)->tasks[a][0] - tasks[b][0]);
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->tasks[a][1] == tasks[b][1]?a-b:tasks[a][1] - tasks[b][1]);
        for(int i =0;i<tasks.length;i++) iq.add(i);
        int c = 0;
        int i = 0;
        int pos = 0;
        int[] o = new int[tasks.length];
        while(iq.size()>0) {
            int iqt = iq.poll();
            int[] t = tasks[iqt];
            while(c<t[0]) {
                if(q.size()==0) break;
                int p = q.poll();
                c+=tasks[p][1];
                o[pos] = p;
                pos++;
            }
            if(c<t[0]) c = t[0];
            i++;
            q.add(iqt);
        }
        while(q.size()>0) {
            o[pos] = q.poll();
            pos++;
        }
        return o;
    }
}
