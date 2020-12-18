package com.sac;

import java.util.Arrays;

public class Solution {

    public int[] intersect(int[] nums1, int[] nums2){

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0, j=0, k=0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                ++i;
            }else if(nums1[i] > nums2[j]){
                ++j;
            }else{
                nums1[k++] = nums1[i++];
                ++j;
            }
        }

        return Arrays.copyOfRange(nums1,0,k);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        Solution solution = new Solution();
        int[] result = solution.intersect(nums1,nums2);
        for (int i = 0;  i < result.length;i++) {
            System.out.print(result[i] + "\t");
        }
    }
}
