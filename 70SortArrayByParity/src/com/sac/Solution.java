package com.sac;

public class Solution {

    public int[] sortArrayByParity(int[] A) {

        int[] result = new int[A.length];

        int lowIndex = 0, highIndex = A.length - 1;

        for (int i : A) {
            if (i % 2 == 0) {
                result[lowIndex++] = i;
            } else {
                result[highIndex--] = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {3, 1, 2, 4};
        Solution solution = new Solution();
        int[] result = solution.sortArrayByParity(nums);
        for (int i : result) {
            System.out.print(i + "\t");
        }
    }
}
