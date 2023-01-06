import java.util.PriorityQueue;

public class Solution1605 {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] o = new int[rowSum.length][colSum.length];
        PriorityQueue<Integer> r = new PriorityQueue<>((a, b)->rowSum[a] - rowSum[b]);
        PriorityQueue<Integer> c = new PriorityQueue<>((a,b)->colSum[a] - colSum[b]);
        for(int i = 0;i<rowSum.length;i++) r.add(i);
        for(int i = 0;i<colSum.length;i++) c.add(i);
        int rm = r.poll();
        int cm = c.poll();
        while(r.size()>0 || c.size()>0) {
            if(rowSum[rm]>colSum[cm]) {
                o[rm][cm] = colSum[cm];
                if(c.size()==0) return o;
                rowSum[rm]-=colSum[cm];
                cm = c.poll();
            }
            else {
                o[rm][cm] = rowSum[rm];
                if(r.size()==0) return o;
                colSum[cm]-=rowSum[rm];
                rm = r.poll();

            }
        }
        o[rm][cm] = Math.max(colSum[cm], rowSum[rm]);
        return o;


    }
}
