package com.sac;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> elements = new ArrayList<>();
        if (matrix.length == 0) {
            return elements;
        }

        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = -1;

        while (true) {

            for (int i = 0; i < n; i++) {
                elements.add(matrix[row][++col]);
            }

            if (--m == 0) break;

            for (int i = 0; i < m; i++) {
                elements.add(matrix[++row][col]);
            }

            if (--n == 0) break;

            for (int i = 0; i < n; i++) {
                elements.add(matrix[row][--col]);
            }

            if (--m == 0) break;

            for (int i = 0; i < m; i++) {
                elements.add(matrix[--row][col]);
            }
            if (--n == 0) break;
        }

        return elements;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> elements = solution.spiralOrder(matrix);
        for (int item: elements) {
            System.out.print(item + "\t");
        }
    }
}
