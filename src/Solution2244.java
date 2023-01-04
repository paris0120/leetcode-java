import java.util.Arrays;

public class Solution2244 {
    public int minimumRounds(int[] tasks) {
        int o = -1;
        Arrays.sort(tasks);
        int c = 0;
        int d = 0;
        for(int t: tasks) {
            if(d==t) c++;
            else if(c==1) return -1;
            else {
                o+=(c-1)/3+1;
                c = 1;
                d = t;
            }
        }

        if(c==1) return -1;
        else o+=(c-1)/3+1;
        return o;
    }
}
