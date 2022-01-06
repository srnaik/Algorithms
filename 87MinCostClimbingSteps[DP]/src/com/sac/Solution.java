package com.sac;

public class Solution {



    public int minCostClimbingStairs(int[] cost){

        int [] minCost = new int[cost.length+1];

        for(int i = 2; i < minCost.length; i++){

            int firstStep = minCost[i-1] + cost[i-1];
            int secondStep = minCost[i-2] + cost[i-2];

            minCost[i] = Math.min(firstStep,secondStep);
        }
        return minCost[minCost.length-1];
    }


    public static void main(String[] args) {
        int[] num = {1,100,1,1,1,100,1,1,100,1};

        Solution solution = new Solution();
        int minSum = solution.minCostClimbingStairs(num);
        System.out.println("Minimum cost to climb the stairs is : " + minSum);
    }
}
