package com.daily.leetcodes.April;

import java.util.Arrays;

public class TruncateSentence {
    public static void main(String[] args) {
        String str = "Hello how are you Contestant";
        System.out.println(truncateSentence(str, 4));
    }

    /*
    Input: s = "Hello how are you Contestant", k = 4
    Output: "Hello how are you"
    Explanation:
    The words in s are ["Hello", "how" "are", "you", "Contestant"].
    The first 4 words are ["Hello", "how", "are", "you"].
    Hence, you should return "Hello how are you".
     */
    public static String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < k; i++) {
            sb.append(str[i]+" ");
        }
        return sb.toString().trim();
    }
}
