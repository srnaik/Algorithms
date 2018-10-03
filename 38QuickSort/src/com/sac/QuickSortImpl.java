package com.sac;

import java.util.ArrayList;
import java.util.List;

public class QuickSortImpl {


    public int[] quickSort(int[] arrayItems, int low, int high){
        if(arrayItems == null || arrayItems.length < 2)
            return arrayItems;

        int mid = (low+high)/2;
        int pivot = arrayItems[mid];
        int i = low, j = high;
        while (i < j){

            while (arrayItems[i] < pivot)
                i++;

            while (arrayItems[j] > pivot)
                j--;
            if(i<=j){
                int temp = arrayItems[j];
                arrayItems[j] = arrayItems[i];
                arrayItems[i] = temp;
                j--;
                i++;
            }
        }
        if(low < j)
            quickSort(arrayItems,low,j);
        if(high > i)
            quickSort(arrayItems,i,high);
        return arrayItems;
    }


    public long countSum(List<Integer> numbers){
        long sum = 0;
        int divisor = 1;
        for(int num: numbers){
            while(num >= divisor){
                if(num%divisor == 0){
                    sum = sum+divisor;
                }
                divisor = divisor+2;
            }
            divisor = 1;
        }
        return sum;

    }

    public static void main(String[] args) {

        int[] arrayItems = {1,3,4,-1,0,17,26,99,86,44};
        QuickSortImpl quickSort = new QuickSortImpl();
        System.out.println("Array Items before sorting: " + arrayItems);
        for (int item = 0; item < arrayItems.length; item++) {
            System.out.println(arrayItems[item]);
        }
        arrayItems = quickSort.quickSort(arrayItems,0,arrayItems.length-1);

        System.out.println("Array Items after sorting: " + arrayItems);
        for (int item = 0; item < arrayItems.length; item++) {
            System.out.println(arrayItems[item]);
        }

        Math.abs(10);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(10);

        System.out.println(quickSort.countSum(list));
    }
}
