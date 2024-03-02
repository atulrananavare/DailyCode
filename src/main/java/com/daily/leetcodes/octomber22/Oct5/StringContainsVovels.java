package com.daily.leetcodes.octomber22.Oct5;

public class StringContainsVovels {
    //Java Program to check if a vowel is present in the string?
    public static void main(String[] args) {
        String str = "hellow";

        boolean result = str.toLowerCase().matches(".*[aeiou].*");
        System.out.println(result);


        String str1 = str.replaceAll("[aeiou]", "");
        System.out.println(str1);


    }
}
