package com.sac;

public class Solution {

    public int[] findDiagonalOrder(int[][] mat) {

        if (mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }

        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int i = 0, row = 0, col = 0;
        boolean up = true;

        while (row < m && col < n) {
            if (up) {
                while (row > 0 && col < n - 1) {
                    result[i++] = mat[row][col];
                    row--;
                    col++;
                }
                result[i++] = mat[row][col];
                if (col == n - 1) {
                    row++;
                } else {
                    col++;
                }
            } else {
                while (col > 0 && row < m - 1) {
                    result[i++] = mat[row][col];
                    col--;
                    row++;
                }
                result[i++] = mat[row][col];
                if (row == m - 1) {
                    col++;
                } else {
                    row++;
                }
            }
            up = !up;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result = solution.findDiagonalOrder(mat);
        for (int i : result) {
            System.out.print(i + " , ");
        }
    }
}
