package rope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {

    public List<List<Integer>> threeSumProblem(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 3)
            return result;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -2; i++){
            if(i == 0 || nums[i] > nums[i-1]){
                int j = i+1;
                int k = nums.length-1;
                while(j<k){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> inner = new ArrayList<>();
                        inner.add(nums[i]);
                        inner.add(nums[j]);
                        inner.add(nums[k]);
                        result.add(inner);
                        k--;
                        j++;

                        while (j<k && nums[j] == nums[j-1])
                            j++;
                        while(j<k && nums[k] == nums[k+1])
                            k--;
                    }else if(nums[i]+nums[j]+nums[k] < 0){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        ThreeSumProblem threeSumProblem = new ThreeSumProblem();
        System.out.println(threeSumProblem.threeSumProblem(nums));

    }
}
