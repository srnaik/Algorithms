package com.sac;

import java.util.Arrays;

public class BubbleSortImpl {

    public int[] bubbleSort(int[] items){

        for(int i = 0; i < items.length; i++){
            for(int j = 1; j < items.length-i; j++){
                if(items[j-1] >items[j]){
                    int temp  = items[j-1];
                    items[j-1] = items[j];
                    items[j] = temp;
                }
            }
        }

        return items;
    }

    public void bubbleSortVersionTwo(int[] items){

    }

    public static void main(String[] args) {
        int[] items = {99,12,10,9,7,24,4};
        BubbleSortImpl bubbleSort = new BubbleSortImpl();
        items = bubbleSort.bubbleSort(items);
        for (int a : items) {
            System.out.println("Array after sorting is : " + a);
        }
        //Arrays.binarySearch(items,12);
    }
}
