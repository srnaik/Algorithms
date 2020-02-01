package rope;

import java.util.HashMap;

public class TwoSumImpl {

    public int[] getArrayItemIndices(int[] arrayItems, int target){

        if(arrayItems == null || arrayItems.length == 0)
            return null;
        for(int i = 0; i < arrayItems.length; i++){
            for (int j = i+1; j < arrayItems.length; j++){
                if(arrayItems[i]+arrayItems[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    public int[] getArrayItemIndicesUsingMap(int[] arrayItems, int target){

        if(arrayItems == null || arrayItems.length == 0)
            return null;
        HashMap<Integer,Integer> hsMap = new HashMap<>();
        for(int i = 0; i < arrayItems.length; i++){
           if(hsMap.containsKey(target-arrayItems[i]))
               return new int[]{hsMap.get(target-arrayItems[i]), i};
            hsMap.put(arrayItems[i],i);
        }
        return null;
    }




    public static void main(String[] args) {
        int[] arrayItems = {10,40,36,26,23,23};
        TwoSumImpl twoSum = new TwoSumImpl();
        //int[] result = twoSum.getArrayItemIndices(arrayItems,36);
        int[] result = twoSum.getArrayItemIndicesUsingMap(arrayItems,36);
        if (result == null) {
            System.out.print("Target not found");
        } else {
            System.out.print("target found, Array Indexes are: ");
            for (int a : result) {
                System.out.print(a + " ");
            }
        }
    }
}
