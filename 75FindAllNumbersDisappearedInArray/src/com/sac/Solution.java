package com.sac;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> arList = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]) - 1;

            if(nums[val] > 0){
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                arList.add(i+1);
            }
        }
        return arList;
    }

    public static void main(String[] args) {
        int[] items = {4,3,2,7,8,2,3,1};

        Solution solution = new Solution();
        List itemsList = solution.findDisappearedNumbers(items);
        System.out.println(itemsList);
    }
}
