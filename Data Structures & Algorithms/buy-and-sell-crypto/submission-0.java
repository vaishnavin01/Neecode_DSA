class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int currprice:prices){
            if(buyprice<currprice){
                int profit=currprice-buyprice;
                maxprofit=Math.max(maxprofit,profit);

            }
            else{
                buyprice=currprice;
            }
        }
        return maxprofit;

    }
}
