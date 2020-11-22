package com.sac;

public class Solution {

    public int findNumbers(int[] nums){
        int digits = 0, result = 0;

        for(int num: nums){

            while(num != 0){
                num /= num;
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

    }
}
