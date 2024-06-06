package com.daily.leetcodes.May24;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationDifferencebetweenTwoStrings {

    public static void main(String[] args) {
        String s = "abc"; String t = "bac";
        System.out.println(findPermutationDifference(s,t));
    }

    public static int findPermutationDifference(String s, String t) {
        Map<Character, Integer> indexMapS = new HashMap<>();
        Map<Character, Integer> indexMapT = new HashMap<>();

        // Populate indexMapS with indices of characters in s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            indexMapS.put(c, i);
        }

        // Populate indexMapT with indices of characters in t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            indexMapT.put(c, i);
        }

        // Calculate permutation difference
        int diff = 0;
        for (char c : indexMapS.keySet()) {
            if (indexMapT.containsKey(c)) {
                diff += Math.abs(indexMapS.get(c) - indexMapT.get(c));
            }
        }

        return diff;
    }
}
