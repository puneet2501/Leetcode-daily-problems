class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n<=1)
            return 0;
        int[] dp = new int[n];
        if(prices[1]>prices[0])
            dp[1] = prices[1]-prices[0];
        for(int i=2;i<n;i++)
        {
            int maxProfit = dp[i-1]; //cooldown
            //find buy day
            for(int j=0;j<i;j++)
            {
                if(prices[j]>prices[i])
                    continue;
                int preProfit = j>1? dp[j-2]:0; 
                maxProfit = Math.max(maxProfit,
                                    preProfit+prices[i]-prices[j]);
            }
            dp[i] = maxProfit;
        }
        return dp[n-1];
    }
}