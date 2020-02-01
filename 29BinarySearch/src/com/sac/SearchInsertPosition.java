package com.sac;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class SearchInsertPosition {

    public int searchInsert(int[] items, int key){
        int low = 0, high = items.length-1;
        while (low < high){
            int mid = (low+high) >>> 1;

            if(items[mid] < key){
                low = mid+1;
            }else{
                high = mid;
            }
        }

        return items[low] < key ? low +1 : low;
    }

    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        SearchInsertPosition position = new SearchInsertPosition();
        int[] a = {1,3,5,6};
        int pos = position.searchInsert(a,2);
        System.out.println("Position of the given key is : " + pos);
        Stack stack = new Stack();
        System.out.println(stack.size());
    }
}
