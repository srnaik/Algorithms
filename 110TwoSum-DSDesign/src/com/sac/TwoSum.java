package com.sac;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    Map<Integer, Integer> hsMap = new HashMap<>();

    public void add(int value) {
        int count = hsMap.containsKey(value) ? hsMap.get(value) : 0;
        hsMap.put(value, count + 1);

    }


    public boolean find(int value) {
        for (Map.Entry<Integer, Integer> entry : hsMap.entrySet()) {
            int num1 = entry.getKey();
            int num2 = value - num1;

            if (num1 == num2) {
                if (entry.getValue() >= 2) {
                    return true;
                }
            } else if (hsMap.containsKey(num2)) {
                return true;
            }
        }
        return false;
    }
}
