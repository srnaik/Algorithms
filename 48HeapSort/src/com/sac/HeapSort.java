package com.sac;

public class HeapSort {

   private void sort(int[] arrayItems){

       int length = arrayItems.length;

       for(int i = length/2 -1; i >= 0; i--)
           heapify(arrayItems,length,i);

       for(int i = length-1; i >= 0 ; i--){
           int temp = arrayItems[0];
           arrayItems[0] = arrayItems[i];
           arrayItems[i] = temp;

           heapify(arrayItems,i,0);
       }


   }

   private void heapify(int[] arrayItems, int length, int start){

       int rootIndex = start;
       int lowerIndex = 2*start+1;
       int higherIndex = 2*start+2;

       if(lowerIndex < length && arrayItems[lowerIndex] > arrayItems[rootIndex])
            rootIndex = lowerIndex;

       if(higherIndex < length && arrayItems[higherIndex] > arrayItems[rootIndex])
           rootIndex = higherIndex;

       if(rootIndex != start){
           int swap = arrayItems[rootIndex];
           arrayItems[rootIndex] = arrayItems[start];
           arrayItems[start] = swap;

           heapify(arrayItems,length,rootIndex);
       }
   }


    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] items = {12, 11, 13, 5, 6, 7};
        heapSort.sort(items);
        System.out.println("Array Items After sorting");
        for(int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
}
