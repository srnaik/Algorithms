package com.sac;

/**
 * Leetcode 167. Two Sum II - Input Array Is Sorted
 */
public class Solution {

    public int[] twoSum(int[] numbers, int target) {

        int low = 0, high = numbers.length - 1;

        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } else if (target > sum) {
                low++;
            } else {
                high--;
            }
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        Solution solution = new Solution();
        int[] result = solution.twoSum(numbers, 18);

        for (int item : result) {
            System.out.print(item + "\t");
        }
    }
}
