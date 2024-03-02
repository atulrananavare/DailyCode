package com.daily.leetcodes.july;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SingleNumber {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 2, 1);
        Set<Integer> set = new HashSet<>();

        List<Integer> list = arr.stream().filter(s -> !set.add(s)).collect(Collectors.toList());
        System.out.println(list);

       int[] array= {2, 2, 1};
        System.out.println(findSingleNumber(array));
    }

    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
