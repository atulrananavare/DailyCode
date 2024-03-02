package com.daily.leetcodes.Feb.feb6;

public class RemoveVowelsFromString {

    //Remove vowels from String
    public static void main(String[] args) {
        String str = "atul";

        String sb = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(sb);
    }
}
