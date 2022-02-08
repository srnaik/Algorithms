package com.sac;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public void duplicateZeros(int[] nums) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {

            queue.add(nums[i]);

            if (nums[i] == 0) {
                queue.add(nums[i]);
            }

            nums[i] = queue.remove();
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};

        Solution solution = new Solution();
        solution.duplicateZeros(nums);

        for (int num : nums) {
            System.out.print(num + "\t");
        }
    }
}
