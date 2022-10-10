package com.daily.Oct9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateFromList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set set = new HashSet();
        myList.stream().filter(x -> !set.add(x)).forEach(System.out::println);
    }
}
