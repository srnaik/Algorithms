package com.sac;

public class MinSortedArrayDuplicates {

    public int minSortedArray(int[] nums){

        int low = 0, high = nums.length-1;
        while (high > low && nums[low] >= nums[high]){
            int mid = (low + high)/2;
            if(nums[mid] > nums[high]){
                low = mid +1;
            }else if(nums[mid] < nums[high]){
                high = mid;
            }else{
                low = low +1;
            }
        }

        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,0,2};
        MinSortedArrayDuplicates duplicates = new MinSortedArrayDuplicates();
        int lowest = duplicates.minSortedArray(nums);
        System.out.println("Lowest number in the array is " + lowest);
    }
}
