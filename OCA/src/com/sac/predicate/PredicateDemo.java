package com.sac.predicate;

import java.util.ArrayList;
import java.util.List;

public class PredicateDemo {

    public static List<String>  sortList(List<String> arList){
        arList.removeIf( s -> s.charAt(0) != 'h');
        return arList;
    }

    public static void main(String[] args) {
        List<String> arList = new ArrayList<>();
        arList.add("Long Ear");
        arList.add("Floppy");
        arList.add("hoppy");
        arList = sortList(arList);
        System.out.println(arList);
    }
}
