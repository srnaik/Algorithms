package com.sac;

public class Solution {

    public void moveZeros(int[] nums){
        int i = 0, j = 0;

        while(j < nums.length){
            if(nums[j]!=0){
                nums[i++] = nums[j];
            }
            j++;
        }

        while(i< nums.length){
            nums[i++] = 0;
        }

        for (int k: nums) {
            System.out.print(k + "\t");
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        Solution solution = new Solution();
        solution.moveZeros(nums);
    }
}
