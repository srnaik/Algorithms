package com.sac;

public class InsertionSort {



    public void insertionSort(int[] items){

        for(int i = 1; i < items.length; i++){
            int j = i-1;
            int key = items[i];
            while( j >= 0 && items[j] > key){
                items[j+1] = items[j];
                j = j-1;
            }
            items[j+1] = key;
        }
    }

    public static void main(String[] args) {
         int[] items = {4,3,60,24,-1,16,8,46,32};
         InsertionSort insertionSort = new InsertionSort();
         insertionSort.insertionSort(items);

        System.out.println("After Sorting");
        for (int item: items) {
            System.out.print(item + "\t");
        }
    }
}
