package com.sac;

import java.util.HashMap;
import java.util.Objects;

public class TwoSumImpl {

    /**
     * This is the Brute-Force approach.
     * <p>
     * Time Complexity - O(n2)
     *
     * @param arrayItems
     * @param target
     * @return
     */
    public int[] getArrayItemIndices(int[] arrayItems, int target) {

        if (Objects.isNull(arrayItems) || arrayItems.length == 0) {
            return null;
        }

        for (int i = 0; i < arrayItems.length; i++) {
            for (int j = i + 1; j < arrayItems.length; j++) {
                if (arrayItems[i] + arrayItems[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * This is the most ideal approach using Map data structure.
     * <p>
     * Time Complexity - O(n)
     *
     * @param arrayItems
     * @param target
     * @return
     */
    public int[] getArrayItemIndicesUsingMap(int[] arrayItems, int target) {

        if (Objects.isNull(arrayItems) || arrayItems.length == 0) {
            return null;
        }

        HashMap<Integer, Integer> hsMap = new HashMap<>();
        for (int i = 0; i < arrayItems.length; i++) {
            if (hsMap.containsKey(target - arrayItems[i])) {
                return new int[]{hsMap.get(target - arrayItems[i]), i};
            }
            hsMap.put(arrayItems[i], i);
        }
        return null;
    }


    public static void main(String[] args) {

        int[] arrayItems = {10, 40, 36, 26, 23, 23};
        TwoSumImpl twoSum = new TwoSumImpl();

        int[] bruteForceResult = twoSum.getArrayItemIndices(arrayItems, 36);
        int[] dataStructureResult = twoSum.getArrayItemIndicesUsingMap(arrayItems, 36);

        if (dataStructureResult == null) {
            System.out.print("Target not found");
        } else {
            System.out.print("Target found, Array Indexes are: ");
            for (int a : dataStructureResult) {
                System.out.print(a + "\t");
            }
        }
    }
}
