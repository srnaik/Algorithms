package com.sac;

public class Solution {

    public int maxProfit(int[] prices){

        int sold = Integer.MIN_VALUE, held = Integer.MIN_VALUE, reset = 0;

        for(int price : prices){
            int preSold = sold;
            sold = held + price;
            held = Math.max(held, reset-price);
            reset = Math.max(reset, preSold);
        }
        return Math.max(sold,reset);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {1,2,3,0,2};
        int profit = solution.maxProfit(prices);
        System.out.println("Max profit is: " + profit);
    }
}
