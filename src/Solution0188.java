public class Solution0188 {
    public int maxProfit(int k, int[] prices) {
        int[][] profit = new int[k][2];
        for(int i = 1;i<prices.length;i++) {
            int[][] tmp = new int[k][2];
            int ret = prices[i] - prices[i-1];
            tmp[0][0] = Math.max(0, profit[0][0]) + ret;
            tmp[0][1] = Math.max(profit[0][1], profit[0][0]);
            for(int ki = 1; ki<k ;ki++) {
                tmp[ki][0] = Math.max(profit[ki-1][1], profit[ki][0]) + ret;
                tmp[ki][1] = Math.max(profit[ki][1], profit[ki][0]);

            }
            profit=tmp;
        }

        int ret = 0;
        for(int[]ps: profit) {
            for(int p:ps) {
                if(ret<p) ret = p;
                System.out.println(p);
            }
        }
        return ret;

    }
}
