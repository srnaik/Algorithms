package com.sac;

public class SelectionSort {


    private void selectionSort(int[] items){

        if(items == null || items.length < 2)
            return;

        for(int i = 0; i < items.length-1; i++){
            for(int j = i+1; j< items.length; j++){

                if(items[j] < items[i]){
                    int temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] items = {10,2,-10,4,8};
        selectionSort.selectionSort(items);
        System.out.println("Array items after sorting");
        for (int item: items)
            System.out.print(item + " \t");
    }
}
