package com.daily.Oct8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OnlyOddNumber {
    public static void main(String[] args) {
        //Check if a List of integers contains only odd numbers?
        List<Integer> list = Arrays.asList(12, 13, 5, 7, 9, 17, 20, 34);
        list.stream().filter(num -> (num % 2 != 0)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println(checkOdd(list));
    }

    private static List<Integer> checkOdd(List<Integer> list) {

        return list.parallelStream().filter(n -> (n % 2 != 0)).collect(Collectors.toList());

    }
}
