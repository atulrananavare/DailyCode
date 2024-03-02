package com.daily.leetcodes.Feb.feb6;
//Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
//        Output: 6
//        Explanation:
//        - The first sentence, "alice and bob love leetcode", has 5 words in total.
//        - The second sentence, "i think so too", has 4 words in total.
//        - The third sentence, "this is great thanks very much", has 6 words in total.
//        Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaximumNumOfWordsInSentence {

    public static void main(String[] args) {
        String[] arr = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(arr));
    }

    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            maxWords = Math.max(maxWords, words.length);
        }
        return maxWords;

    }
}
