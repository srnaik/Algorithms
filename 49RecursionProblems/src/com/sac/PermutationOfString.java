package com.sac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationOfString {

    private static int counter = 0;
    List<String> permutations = new ArrayList<>();


    public static void main(String[] args) {
        PermutationOfString permutation = new PermutationOfString();

        permutation.permutation("aba");

        if(!permutation.permutations.isEmpty()){
            System.out.println(permutation.permutations);
        }
    }

    private  void permutation(String str) {
        permutation("", str);
    }

    private  void permutation(String prefix, String str) {

        if(str == null)
            return;

        int n = str.length();
        if (n == 0 && !permutations.contains(prefix)) {
            //System.out.println(++counter +"\t"+ prefix);
                permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
}
