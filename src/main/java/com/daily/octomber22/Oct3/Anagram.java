package com.daily.octomber22.Oct3;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "madam".toLowerCase();
        String str2 = "adamm".toLowerCase();

        //Check length
        if (str1.length() == str2.length()) {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            //Sort both arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            //Check equality of two arrays
            if (Arrays.equals(arr1, arr2)) {
                System.out.println(str1 + " and " + str2 + " are anagram");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram");
            }
        }

    }
}
