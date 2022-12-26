public class Solution0123 {
    public int maxProfit(int[] prices) {
        int[] profit = new int[4];
        for(int i = 1; i< prices.length; i++) {
            int[] tmp = new int[4];
            int ret = prices[i] - prices[i-1];

            tmp[0] = Math.max(profit[0], 0) + ret;
            tmp[1] = Math.max(profit[1], profit[0]);
            tmp[2] = Math.max(profit[2], profit[1]) + ret;
            tmp[3] = Math.max(profit[3], profit[2]);
            profit = tmp;
        }
        int ret = 0;
        for(int v:profit) {
            if(v>ret) ret = v;
        }
        return ret;

    }
}
