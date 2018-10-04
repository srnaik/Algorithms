package com;

public class ContainerWithMostWaterImpl {

    public int getMaxCapacity(int[] arrayItems){

        int maxCapacity = 0, low = 0, high = arrayItems.length-1;
        while (low < high){
            maxCapacity = Math.max(maxCapacity,Math.min(arrayItems[low],arrayItems[high]) * (high-low));
            if(arrayItems[low] < arrayItems[high])
                low++;
            else
                high--;
        }
        return maxCapacity;

    }

    public static void main(String[] args) {
        int[] arrayItems = {1,0,0,2,5,4,6,3,7};
        ContainerWithMostWaterImpl container = new ContainerWithMostWaterImpl();
        System.out.println("Max Capacity is: " + container.getMaxCapacity(arrayItems));
    }
}
