class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length, maxProfit = 0, buyDay = prices[0];
        for (int i = 1; i < n; i++) {
            if (buyDay < prices[i]) {
                maxProfit = Math.max(maxProfit, prices[i] - buyDay);
            }
            buyDay = Math.min(prices[i], buyDay);
        }
        return maxProfit;
    }
}