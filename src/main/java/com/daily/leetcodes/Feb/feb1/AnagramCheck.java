package com.daily.leetcodes.Feb.feb1;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        System.out.println(isAnagram("allergy","allergic"));
    }

    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a, String b) {

        //string to char
        //sort
        //reverse
        //check equality

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (arr1.length != arr2.length)
            return false;

        if (Arrays.equals(arr1, arr2)) {
            return true;
        }
        return false;
    }
}
