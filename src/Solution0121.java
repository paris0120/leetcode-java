public class Solution0121 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for(int i=1;i<prices.length;i++) {
            if(prices[i]<buy) {
                buy = prices[i];
            }
            else{
                profit = Math.max(profit, prices[i]-buy);
            }
        }
        return profit;
    }
}
