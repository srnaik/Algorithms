package com.sac;

import java.util.Arrays;

public class Solution {

    public int uniquePaths(int m, int n){
        int[][] dp = new int[m][n];

        for(int[] arr: dp){
            Arrays.fill(arr,1);
        }

        for(int col = 1; col < m; col++){
            for(int row = 1; row < n; row++){
                dp[col][row] = dp[col-1][row] + dp[col][row-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.uniquePaths(3,2);
        System.out.println("Maximum number of unique paths: " + result);
    }
}
