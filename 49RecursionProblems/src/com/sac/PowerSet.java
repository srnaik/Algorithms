package com.sac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {

    private List<List<Integer>> subsets(int[] items){

        if(items == null || items.length == 0)
            throw new IllegalArgumentException("Input array is either empty or null");

        Arrays.sort(items);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for(int item: items){
            int size = result.size();
            for(int i = 0; i< size; i++){
                List<Integer> resultListItem = new ArrayList<>(result.get(i));
                resultListItem.add(item);
                result.add(resultListItem);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        PowerSet powerSet = new PowerSet();
        int[] array = {1,2};
        List<List<Integer>> resultList = powerSet.subsets(array);
        System.out.println(resultList);

    }
}
