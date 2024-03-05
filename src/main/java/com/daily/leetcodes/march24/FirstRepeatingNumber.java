package com.daily.leetcodes.march24;

import java.util.HashMap;
import java.util.HashSet;

public class FirstRepeatingNumber {

    public static void main(String[] args) {
        int[] arr1 = {3,9,5,9,10};
        int[] arr2 = {1,5,3,4,3,6,5};

        System.out.println(findFirstRepeatingNumber(arr1));
        System.out.println(findFirstRepeatingNumber_Way2(arr2));
    }

    public static int findFirstRepeatingNumber(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static int findFirstRepeatingNumber_Way2(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int min = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                min = arr[i];
            } else {
                set.add(arr[i]);
            }
        }
        return min;
    }
}
