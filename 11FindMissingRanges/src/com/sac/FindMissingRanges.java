package com.sac;

import java.util.ArrayList;
import java.util.List;

public class FindMissingRanges {

    public List<String> findMissingRanges(int[] nums, int lower, int higher){
        List<String> arList = new ArrayList<>();
        if(nums == null || nums.length == 0){
            arList.add(addRanges(lower,higher));
            return arList;
        }else if(lower > higher){
            return arList;
        }

        int prev = lower - 1;
        for(int i = 0; i <= nums.length; i++){
            int curr = (i == nums.length) ? higher+1 : nums[i];
            if(prev + 2 <= curr){
                arList.add(addRanges(prev+1, curr-1));
            }
            prev = curr;
        }
        return arList;
    }

    private String addRanges(int lower, int higher){
        return (higher == lower) ? String.valueOf(lower) : lower + "->" + higher;
    }


    public static void main(String[] args) {
        int[] elements = {0,1,3,50,75};
        FindMissingRanges findMissingRanges = new FindMissingRanges();
        System.out.println(findMissingRanges.findMissingRanges(elements,0,99));
    }
}
