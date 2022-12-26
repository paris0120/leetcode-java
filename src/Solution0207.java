import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution0207 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] list = new LinkedList[numCourses];
        int[] count = new int[numCourses];
        int course = 0;
        for(int[] pre: prerequisites) {
            int c = pre[0];
            int p = pre[1];
            if(count[c]==0) course++;
            count[c]++;
            List<Integer> clist = list[p];
            if(clist==null) {
                clist = new LinkedList<Integer>();
                list[p]=clist;
            }
            clist.add(c);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<numCourses;i++) {
            if(count[i] == 0) {
                q.add(i);
            }
        }
        while(q.size()>0) {
            int p = q.remove();
            if(list[p]!=null) {
                for(int c:list[p]) {
                    count[c]--;
                    if(count[c]==0) {
                        q.add(c);
                        course--;
                    }
                }

            }
        }

        System.out.println(course);

        return course==0;

    }
}
