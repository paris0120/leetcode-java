import java.util.Arrays;

public class Solution2279 {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] r = new int[rocks.length];

        for(int i=0;i<rocks.length;i++) {
            r[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(r);
        int o = 0;
        for(int i=0;i<rocks.length;i++) {
            additionalRocks -= r[i];
            if(additionalRocks<0) break;
            o++;
        }
        return o;
    }
}
