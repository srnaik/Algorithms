package com.sac;

import java.util.Arrays;

public class Solution {

    public int findMaxConsecutiveOnes(int[] nums){

        int count = 0, result = 0;

        for (int num: nums) {
            if(num == 1){
                count++;
                result = Math.max(count,result);
            }else{
                count=0;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] items = {1,0,1,1,1,0,0,1};
        Solution solution = new Solution();
        int result = solution.findMaxConsecutiveOnes(items);
        System.out.println("Total Count: " + result);
        Arrays.sort(items);
    }
}
