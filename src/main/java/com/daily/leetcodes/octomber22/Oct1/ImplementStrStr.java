package com.daily.leetcodes.octomber22.Oct1;

public class ImplementStrStr {
    public static void main(String[] args) {

        String haystack = "leetcode", needle = "leeto";

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.isEmpty() || needle.isEmpty()) {
            return -1;
        } else if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }

        return -1;
    }
}
