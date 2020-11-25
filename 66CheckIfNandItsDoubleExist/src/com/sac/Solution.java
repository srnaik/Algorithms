package com.sac;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean checkIfExist(int[] arr) {

        Set<Double> hSet = new HashSet<>();
        int number = 0;

        for (int i = 0; i < arr.length; i++) {
            if (hSet.contains((double) arr[i] * 2) || hSet.contains(arr[i] / 2)) {
                return true;
            } else {
                hSet.add((double) arr[i]);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {10, 2, 5, 3};
        boolean isExist = solution.checkIfExist(num);

        if (isExist) {
            System.out.println("Number Exist");
        } else {
            System.out.println("Number doesn't exist");
        }
    }
}
