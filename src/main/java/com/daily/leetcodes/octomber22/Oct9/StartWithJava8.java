package com.daily.leetcodes.octomber22.Oct9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithJava8 {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        List<String> list = myList.stream().map(x -> x + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());
        System.out.println(list);

        List<String> list2 = myList.stream().map(x -> x + "").filter(s -> s.endsWith("8")).collect(Collectors.toList());
        System.out.println(list2);
    }
}
