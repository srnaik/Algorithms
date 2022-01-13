package com.sac;

public class Solution {

    public int maximumSquare(int[][] matrix){

        int row = matrix.length, col = row > 0 ? matrix[0].length : 0;

        int[][]dp = new int[row+1][col+1];
        int maxSuqare = 0;

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){

                if(matrix[i-1][j-1] == 1){
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]),dp[i-1][j-1])+1;
                    maxSuqare = Math.max(maxSuqare, dp[i][j]);
                }
            }
        }
        return maxSuqare * maxSuqare;
    }

    public static void main(String[] args) {

        int[][] matrix = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        Solution solution = new Solution();
        int result = solution.maximumSquare(matrix);
        System.out.println("Maximum square of a given MXN matrix is : " + result);
    }
}
