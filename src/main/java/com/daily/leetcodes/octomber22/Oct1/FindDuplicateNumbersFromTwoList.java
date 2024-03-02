package com.daily.leetcodes.octomber22.Oct1;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateNumbersFromTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(11, 22, 33, 45, 56, 77, 99).stream().sorted().collect(Collectors.toList());
        List<Integer> list2 = Arrays.asList(11, 22, 54, 65, 77, 88, 45).stream().sorted().collect(Collectors.toList());

        Object[] arr1 = list1.toArray();
        Object[] arr2 = list2.toArray();

        Set set = new HashSet();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
            if (set.add(arr2[i])) {
                System.out.println(arr2[i]);
            }
        }

    }

}
