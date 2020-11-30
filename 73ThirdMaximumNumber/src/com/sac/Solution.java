package com.sac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public int thirdMax(int[] nums) {

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!arrayList.contains(nums[i])) {
                arrayList.add(nums[i]);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        if (arrayList.size() < 3) {
            return arrayList.get(0);
        } else {
            return arrayList.get(2);
        }
    }
}
