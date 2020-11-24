package com.sac;

public class Solution {


    int index=0;
    int prev = Integer.MIN_VALUE;

    public int removeDuplicates(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            if(prev != nums[i]){
                nums[index++] = nums[i];
                prev = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        Solution solution = new Solution();
        int val = solution.removeDuplicates(nums);
        System.out.println("Integer Value: " + val);
    }
}
