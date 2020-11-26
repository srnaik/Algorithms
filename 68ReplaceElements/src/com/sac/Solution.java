package com.sac;

public class Solution {

    public int[] replaceElements(int[] arr) {

        int size = arr.length;
        int maxVal = arr[size-1];

        arr[size-1] = -1;

        for(int i = size-2; i >= 0; i--){

            int temp = arr[i];
            arr[i] = maxVal;

            if(maxVal < temp){
                maxVal=temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] items = {17,18,5,4,6,1};

        Solution solution = new Solution();
        items = solution.replaceElements(items);

        for(int i: items){
            System.out.print(i + "\t");
        }
    }
}
