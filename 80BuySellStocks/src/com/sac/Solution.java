package com.sac;

public class Solution {

    public int maxProfit(int[] prices){
        int maxProfit = 0;

        for(int i = 1; i < prices.length;i++){
            if(prices[i] > prices[i-1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int maxProfit = solution.maxProfit(new int[]{7,1,5,3,6,4});
        System.out.println("max Profit is: " + maxProfit);
    }
}
