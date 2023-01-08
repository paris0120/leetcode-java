public class Solution0134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int c = 0;
        int g = 0;
        int o = 0;
        for(int i = 0;i<gas.length;i++) {
            int d = gas[i] - cost[i];
            c+=d;
            g+=d;
            if(g<0) {
                o=i+1;
                g=0;
            }
        }
        if(c<0) return -1;
        return o;
    }
}
