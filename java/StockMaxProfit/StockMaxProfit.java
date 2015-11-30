public class StockMaxProfit {

    /* 
     * Say you have an array for which the ith element is the price of a 
     * given stock on day i.
     *
     * If you were only permitted to complete at most one transaction 
     * (ie, buy one and sell one share of the stock), 
     * design an algorithm to find the maximum profit.
     * 
     * [1, 2, 3, 4, 5] -> 4
     * [5, 4, 3, 2, 1] -> 1
     * [3, 5, 1, 2, 5, 6, 12] -> 11
     * [1, 10, 1, 12, 1, 3] -> 11
     */
    public static int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int maxProfit = Integer.MIN_VALUE;
        int min = prices[0];
        int currentProfit;
        for (int i = 1; i < prices.length; i += 1) {
            if (prices[i] < min) {
                min = prices[i];
            }
            currentProfit = prices[i] - min;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}
