package com.daily.octomber22.Oct4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String str = "atul";

        //Way1
        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        //Way2
        System.out.println();
        System.out.println("===========Way2=============");
        System.out.println(reverseStringBuilder(str));

        //Way3
        System.out.println();
        System.out.println("===========Way3=============");
        System.out.println(reverseUsingJava8(str));

    }

    private static String reverseStringBuilder(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();

        return builder.toString();
    }

    private static String reverseUsingJava8(String str) {
        String word = str.chars().mapToObj(ch -> (char) ch).reduce("", (c, s) -> s + c, (s1, s2) -> s2 + s1);
        return word;
    }
}
