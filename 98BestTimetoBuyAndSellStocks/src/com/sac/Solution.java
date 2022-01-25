package com.sac;

public class Solution {


    public int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i =0; i < prices.length; i++){

            if(prices[i] < minPrice){
                minPrice = prices[i];
            } else if(maxProfit < prices[i]-minPrice){
                maxProfit = prices[i]-minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7,1,5,3,6,4};
        int profit = solution.maxProfit(prices);
        System.out.println("Max profit : " + profit);
    }
}
