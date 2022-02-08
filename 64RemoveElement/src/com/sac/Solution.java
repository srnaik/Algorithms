package com.sac;

public class Solution {

    public int removeElement(int[] nums, int val) {

        int length = nums.length, index = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;

    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};

        Solution solution = new Solution();
        int val = solution.removeElement(nums, 2);
        System.out.println("Array length after remvoing duplicates " + val);

    }
}
