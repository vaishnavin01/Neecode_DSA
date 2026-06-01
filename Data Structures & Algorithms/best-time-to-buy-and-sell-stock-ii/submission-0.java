class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;                  // stores best profit so far
           // minimum price seen so far
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {     // if we can sell today for profit
                int profit = prices[i] -prices[i-1];
                maxprofit+=profit;
           
        }
        
     }
     return maxprofit;
    }
}
