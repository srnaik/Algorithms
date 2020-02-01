package com.sac;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n){

        int i = m-1, j = n-1, k = m+n-1;

        while (i >= 0 && j >= 0){

            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }

        while ( j >= 0){
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        /*List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> square = number.stream().map(x-> x*x).collect(Collectors.toList());
        square.forEach( x-> System.out.println(x));

        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        result.forEach(x-> System.out.println(x));*/
        Solution solution = new Solution();
        solution.listDemo();
        solution.setDemo();
    }



    int[] fibonacci(int n){

        int[] fib = new int[n+2];

        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i <=n; i++){
            fib[i] = fib[i-1]+fib[i-2];
        }


        return fib;
    }


    private void listDemo(){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ListIterator iterator = list.listIterator();

        //printElements(iterator);
        iterator = list.listIterator();
        printElements(iterator);
    }

    private void printElements(Iterator iterator){
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private void setDemo(){

        Set<Object> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2);
        hashSet.add(null);

        for (Object integer: hashSet) {
            System.out.println(integer);
        }

        /**
         * TreeSet doesn't allow null values, HashSet allows one null value to added.
         * TreeSet internally uses NavigableMap<E, Object> to store the keys.
         * HashSet internally uses HashMap<E, Object> to store keys.
         */
    }


}
