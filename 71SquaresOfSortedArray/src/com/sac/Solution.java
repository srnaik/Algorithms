package com.sac;

import java.util.Arrays;

public class Solution {

    public int[] sortedSquares(int[] A){
        int[] result = new int[A.length];

        for(int i =0; i < A.length; i++){
            result[i] = A[i] * A[i];
        }

        Arrays.sort(result);
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        Solution solution = new Solution();
        int[] items = solution.sortedSquares(nums);

        for(int i: items){
            System.out.print(i + "\t");
        }
    }
}
