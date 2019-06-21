package com.sac;

public class ArraySum {


    public int findIndex(int[] items){


        if(items == null || items.length == 0)
            return -1;

        int i = 0, j = items.length-1, sum1 = items[i++], sum2 = items[j--];

        while (i < j){

            if(sum1 < sum2){
                sum1 = sum1 + items[i++];
            }else if(sum1 > sum2){
                sum2 = sum2 + items[j--];
            }

            if(sum1 == sum2 && i!=j)
                return -1;
        }

        return (i == j && sum1 == sum2) ? i :-1;
    }


    public int pivotIndex(int[] nums) {

        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }


    public static void main(String[] args) {
        // Inputs:  {1,14,18,4,6,2,3}; {2,3,7,6,8,4}; {1,14,18,7,4,6,2,3}
        int[] items = {-1,-1,-1,-1,-1,0};
        ArraySum arraySum = new ArraySum();
        int index = arraySum.findIndex(items);
        if(index > -1){
            System.out.println("Index found at: " + index);
        }else{
            System.out.println("Array Index not found ");
        }
    }
}
