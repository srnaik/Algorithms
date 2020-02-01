package rope;

import java.util.HashSet;
import java.util.Set;

public class FindPairsImpl {

    public boolean isPairsPresent(int[] arrayElements){

        if(arrayElements == null || arrayElements.length == 0)
            return false;
        Set<Integer> hsSet = new HashSet<>();
        for (int a : arrayElements) {
            hsSet.add(a);
        }
        for(int i = 0; i < arrayElements.length; i++){
            for(int j = i+1; j < arrayElements.length; j++){
                if(hsSet.contains(arrayElements[i]+arrayElements[j]))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(11%3);
        int[] arrayElements = {10,-3,-19,-22,66,78,0,-12,67,99};
        FindPairsImpl findPairs = new FindPairsImpl();
        boolean isPresent = findPairs.isPairsPresent(arrayElements);
        if(isPresent)
            System.out.println("Pairs Found");
        else
            System.out.println("Pairs Not Found");
    }
}
