package com.daily.Feb2024;

public class PalindromeStringArray {

    public static void main(String[] args) {
        String[] arr ={"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(arr));
    }

    public static String firstPalindrome(String[] words) {
        for (String str : words) {
            int i = 0;
            int j = str.length() - 1;

            while (j >= i) {
                if (str.charAt(j) != str.charAt(i)) {
                    break;
                }
                j--;
                i++;
            }

            if (j <= i) {
                return str;
            }
        }
        return "";
    }
}

