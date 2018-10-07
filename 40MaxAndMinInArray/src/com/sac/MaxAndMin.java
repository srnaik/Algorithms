package com.sac;

import java.util.Arrays;

public class MaxAndMin {

    public int getMaxElement(int[] array){
        int max = array[0];

        for (int item : array) {
            if(item > max)
                max = item;
        }
        return max;
    }

    public int getMinElement(int[] array){
        int min = array[0];

        for (int item: array) {
            if(item < min)
                min = item;
        }
        return min;
    }

    public int getSecondLargestElement(int[] array){
        int max = array[0];
        int secondMax = array[0];

        for(int item: array){
            if(item > max){
                secondMax = max;
                max = item;
            }else if(item > secondMax && item < max){
                secondMax = item;
            }
        }

        return secondMax;
    }


    public int getKthLargestElement(int[] array, int k){

        Arrays.sort(array);
        return array[array.length - k];
    }
    public static void main(String[] args) {
        int[] array = {10,23,67,5,4,3,12,89,100,986,78,101};
        MaxAndMin maxAndMin = new MaxAndMin();
        System.out.println("Max Element: "+ maxAndMin.getMaxElement(array));
        System.out.println("Min Element: "+ maxAndMin.getMinElement(array));
        System.out.println("Second Max Element: " + maxAndMin.getSecondLargestElement(array));
        System.out.println("Kth largest Element: " + maxAndMin.getKthLargestElement(array,1));
    }
}
