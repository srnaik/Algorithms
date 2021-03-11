package com.sac;

import java.util.*;

public class Solution {


    public static void main(String[] args) {
        Solution solution = new Solution();

        String inputString = "Formula-1 is one of the high intense and exiting sports in the world is " +
                "There can be no other sports like Formula-1 in terms of intensity and engineering, it is just too good";

        Set<String> excludedSet = new HashSet<>();
        excludedSet.add("Formula-1");

        List<String> outputList = solution.getWordsWithMaxFrequency(inputString, excludedSet);
        System.out.println("Output List: ");

        for (String str : outputList) {
            System.out.print(str + "\t");
        }
    }

    public List<String> getWordsWithMaxFrequency(String sentence, Set<String> excludedSet) {

        if (sentence == null || sentence.isEmpty()) {
            return null;
        }

        Map<String, Integer> wordsFrequencyMap = new HashMap<>();
        List<String> wordsList = new ArrayList<>();
        String[] wordsArray = sentence.split(" ");
        int maxFrequency = 0;

        for (int i = 0; i < wordsArray.length; i++) {

            String word = wordsArray[i];

            if (excludedSet != null && !excludedSet.contains(word)) {
                int count = wordsFrequencyMap.getOrDefault(word, 0);
                wordsFrequencyMap.put(word, ++count);
                maxFrequency = Math.max(maxFrequency, count);
            }

        }

        for (String word : wordsFrequencyMap.keySet()) {

            if (wordsFrequencyMap.get(word) == maxFrequency) {
                wordsList.add(word);
            }

        }
        return wordsList;
    }
}
