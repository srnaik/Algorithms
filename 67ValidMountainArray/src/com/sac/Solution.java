package com.sac;

public class Solution {

    public boolean validMountainArray(int[] arr) {

        int i = 0;
        int j = arr.length - 1;
        int n = arr.length - 1;

        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        while (j > 0 && arr[j] < arr[j - 1]) {
            j--;
        }

        return i > 0 && i == j && j < n;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {0, 3, 2, 1};
        boolean isValid = solution.validMountainArray(arr);
        if (isValid) {
            System.out.println("It is a valid mountain array");
        } else {
            System.out.println("It is not a valid mountain array");
        }
    }
}
