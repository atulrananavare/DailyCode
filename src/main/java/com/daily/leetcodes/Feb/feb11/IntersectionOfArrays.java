package com.daily.leetcodes.Feb.feb11;

import java.util.Arrays;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1={4,9,5};
        int[] arr2={9,4,9,8,4};
        intersection(arr1, arr2);

    }

    public static void intersection(int[] arr1,int[] arr2){
        Arrays.stream(arr1).filter(num -> Arrays.stream(arr2).anyMatch(y -> y == num)).distinct().forEach(System.out::println);
    }
}
