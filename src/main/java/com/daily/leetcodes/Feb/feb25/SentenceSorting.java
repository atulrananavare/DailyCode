package com.daily.leetcodes.Feb.feb25;

import java.util.Arrays;

public class SentenceSorting {

    public static void main(String[] args) {

        String sentence = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(sentence));
    }


    public static String sortSentence(String s) {

        //Input: s = "is2 sentence4 This1 a3"
        //Output: "This is a sentence"

        String[] str = s.split(" ");

        String[] arr = new String[str.length];

        for (String st : str) {
            int len = st.length();
            int pos = st.charAt(len - 1)-'0';
            arr[pos - 1] = st.substring(0, len - 1);
        }

        StringBuilder sb = new StringBuilder();

        for (String a : arr) {
            sb.append(a);
            sb.append(" ");
        }

        return sb.toString().trim();//leading ald trailing space eliminate
    }
}
