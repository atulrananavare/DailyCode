package com.daily.july;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitIterator {
    public static void main(String[] args) {
        String[] words = {"one.two.three","four.five","six"};
        System.out.println(splitWordsBySeparator(List.of(words),'.'));
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        String[] split;
        for (String str : words) {
            list.add(str);
        }

        return list.stream().toList();
    }
}
