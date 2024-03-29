import java.util.Arrays;

public class Solution1833 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++) {
            if(costs[i]>coins) return i;
            coins-=costs[i];
        }
        return costs.length;
    }
}
