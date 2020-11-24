package com.sac;

import java.util.Arrays;

public class Solution {

    public int findNumbers(int[] nums){
        int digits = 0, result = 0;

        for(int i = 0; i < nums.length; i++){

            int val = nums[i];
            while(val != 0){
                val /= val;
                digits++;
            }

            if(digits%2 == 0){
                result++;
            }
            digits = 0;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {12,1,6,171,42,2467,98019,890191};
        Solution solution = new Solution();
        int result = solution.findNumbers(nums);
        System.out.println("Total Numbers with Even number of Digits: " + result);
        Arrays.sort(nums);
        System.out.println(nums);

    }
}
