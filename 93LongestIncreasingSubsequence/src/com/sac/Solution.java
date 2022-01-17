package com.sac;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int lengthOfLIS(int [] nums){

        List<Integer> arList = new ArrayList<>();
        arList.add(nums[0]);

        for(int i = 1; i < nums.length; i++){
            int num = nums[i];
            if(num > arList.get(arList.size()-1)){
                arList.add(num);
            }else{
                int j = binarySearch(arList, num);
                arList.set(j,num);
            }
        }
        return arList.size();
    }

    private int binarySearch(List<Integer> arList, int num){

        int left = 0;
        int right = arList.size()-1;

        while (left < right){
            int mid = left + right >>> 1;
            if(arList.get(mid) < num){
                left = mid+1;
            }else if(arList.get(mid) > num){
                right = mid;
            }else if(arList.get(mid) == num){
                return mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {10,9,2,5,3,7,101,18};
        int length = solution.lengthOfLIS(nums);
        System.out.println("Length of the Longest sun-sequence is: " + length);
    }
}
