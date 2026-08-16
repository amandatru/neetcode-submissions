class Solution {
    public int maxProfit(int[] prices) {
        //[10,1,5,6,7,1]
        //    L 
        //            R
        // -9 -5 -4 -3 -9 
        if (null == prices) {
            return 0;
        }

        int maxProfit = 0;
        int left = 0;
        int currentProfit = 0;

        int buyPrice = prices[left];

        for (int right=1; right<prices.length; right++) {
            currentProfit = prices[right] - buyPrice;

            maxProfit = Math.max(maxProfit, currentProfit);

            if (buyPrice > prices[right]) {
                buyPrice = prices[right];
                left = right;
            }
        }

        return maxProfit;





    }
}
