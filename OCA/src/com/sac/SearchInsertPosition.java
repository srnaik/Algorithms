package com.sac;

public class SearchInsertPosition {

    public int insertPosition(int[] items, int key){

        int low = 0, high = items.length-1;

        while(low < high){
            int mid = low +(high-low)/2;
            if(items[mid] < key)
                low = mid +1;
            else
                high = mid -1;
        }
        return items[low] < key ? low+1: low;
    }


    public static void main(String[] args) {
        int[] items = {0,1,3,5,6};

        SearchInsertPosition position = new SearchInsertPosition();
        int pos = position.insertPosition(items,5);
        System.out.println("The exact position is: " + pos);
    }
}
