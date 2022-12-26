public class Solution0309 {
    public int maxProfit(int[] prices) {
        int[][] profit = new int[prices.length][3];

        for(int i =1;i<prices.length;i++) {
            int rate = prices[i] - prices[i-1];
            profit[i][0] = Math.max(profit[i-1][0]+rate, profit[i-1][1]);
            profit[i][1] = Math.max(profit[i-1][1], profit[i-1][2]);
            profit[i][2] = profit[i-1][0]+rate;
        }
        return Math.max(Math.max(profit[profit.length-1][1], profit[profit.length-1][2]),profit[profit.length-1][0]);

    }
}
