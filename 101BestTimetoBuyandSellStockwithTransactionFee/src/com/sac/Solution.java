package com.sac;

public class Solution {

    public int maxProfit(int[] prices, int fee) {

        int cash = 0, hold = -prices[0];

        for(int i = 1; i < prices.length; i++){
            cash = Math.max(cash, hold+prices[i]-fee);
            hold = Math.max(hold, cash-prices[i]);
        }
        return cash;
    }


    public static void main(String[] args) {

        int[] prices = {1,3,2,8,4,9};
        int fee = 2;

        Solution solution = new Solution();
        int profit = solution.maxProfit(prices,2);
        System.out.println("Maximim Profit: " + profit);
    }
}
