import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution0210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] count = new int[numCourses];
        List<Integer>[] list = new LinkedList[numCourses];
        for(int[] pre: prerequisites) {
            int c = pre[0];
            int p = pre[1];
            count[c]++;
            List<Integer> clist = list[p];
            if(clist==null) {
                clist = new LinkedList<Integer>();
                list[p] = clist;
            }
            clist.add(c);
        }

        int[] output = new int[numCourses];
        int i =0;
        Queue<Integer> q = new LinkedList<>();
        for(int c=0; c<numCourses; c++) {
            if(count[c]==0) q.add(c);
        }
        while(q.size()>0) {
            int p = q.poll();
            output[i] = p;
            i++;
            List<Integer> clist = list[p];
            if(clist!=null) {
                for(int c:clist) {
                    count[c]--;
                    if(count[c]==0) q.add(c);
                }
            }

        }
        if(i==numCourses) return output;
        else return new int[0];
    }
}
