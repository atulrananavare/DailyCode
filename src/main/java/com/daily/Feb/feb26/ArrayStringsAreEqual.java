package com.daily.Feb.feb26;

import java.util.Arrays;
import java.util.Collections;

public class ArrayStringsAreEqual {

    public static void main(String[] args) {

        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1, word2));

        String str=String.join(" ","My", "name", "is", "Niraj", "Pandey");
        System.out.println(str);
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for (String str : word1) {
            sb1.append(str);
        }
        String temp1 = sb1.toString();//temp1="abc"
        Arrays.sort(temp1.toCharArray());

        StringBuilder sb2 = new StringBuilder();
        for (String str : word2) {
            sb2.append(str);
        }
        String temp2 = sb2.toString();//temp1="abc"
        Arrays.sort(temp2.toCharArray());

        if(temp1.equals(temp2)){
            return true;
        }
        return false;
    }
}
