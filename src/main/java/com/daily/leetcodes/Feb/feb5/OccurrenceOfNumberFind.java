package com.daily.leetcodes.Feb.feb5;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfNumberFind {

    public static void main(String[] args) {
        //calculate how many time 7 is occuring
        int[] arr={1,7,17,7,8,9,89,76,45,7,2,3,5,7};

        Map<Integer, Long> occurence = Arrays.stream(arr).mapToObj(n -> n).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Long obj = occurence.get(7);
        System.out.println(obj);
    }
}
