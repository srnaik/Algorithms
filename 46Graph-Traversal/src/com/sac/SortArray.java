package com.sac;

import java.util.Arrays;

public class SortArray {


    public String[] sort(String[] arr){

        if(arr == null || arr.length == 0)
            return arr;

         Arrays.sort(arr);
         return arr;
    }


    public static void main(String[] args) {
        String[] arr = {"abc","xyz","abcd","bcd","abc"};
        SortArray sortArray = new SortArray();
        String[] sortedArray = sortArray.sort(arr);

        for (String str: arr) {
            System.out.println(str);
        }

        for (String str: sortedArray) {
            System.out.println(str);
        }    }


}
