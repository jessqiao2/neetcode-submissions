class Solution {
    public int maxProfit(int[] prices) {

        // use 2 pointers, one for buy and sell starting from 0 and 1 index
        int buy = 0;
        int sell = 1;
        int maxProfit = 0;

        // loop through all prices
        while (sell < prices.length) {
            // if buy price is less than sell, calculate profit
            if (prices[buy] < prices[sell]) {
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(profit, maxProfit);
            } else {
                // if buy price is more than sell, move the buy price
                buy = sell;
            }
            // increment sell price
            sell++;
        }

        // return max profit
        return maxProfit;

        
    }
}
