//121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int buy=prices[0];
        for(int i=1;i<=prices.length-1;i++)
        {
            if(prices[i]>buy)
              max=Math.max(max,(prices[i]-buy));
            else if(prices[i]<buy)
              buy=prices[i];
        }
        return max;
    }
}