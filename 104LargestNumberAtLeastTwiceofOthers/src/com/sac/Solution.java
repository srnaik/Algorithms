package com.sac;

public class Solution {

    public int dominantIndex(int[] nums){
        int max1 = -1;
        int max2 = -1;
        int index = -1;

        for(int i = 0; i < nums.length;i++){
            if(nums[i] > max1){
                max2 = max1;
                max1 = nums[i];
                index = i;
            }else if(nums[i] > max2){
                nums[i] = max2;
            }
        }
        return max1 < 2*max2 ? -1 : index;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,6,1,0};
        int index = solution.dominantIndex(nums);
        System.out.println("Dominant Index Number is: " + index);
    }
}
