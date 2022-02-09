package com.sac;

public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int longestSequence = 0;
        int right = 0;
        int left = 0;
        int numOfZeros = 0;

        while(right < nums.length){
            if(nums[right] == 0){
                numOfZeros++;
            }

            while (numOfZeros == 2){
                if(nums[left] == 0){
                    numOfZeros--;
                }
                left++;
            }

            longestSequence = Math.max(longestSequence, right-left+1);
            right++;
        }
        return longestSequence;
    }


    public static void main(String[] args) {

        int[] nums = {1,0,1,1,0};
        Solution solution = new Solution();
        int maxLength = solution.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum length of 1's: " + maxLength);

    }
}
