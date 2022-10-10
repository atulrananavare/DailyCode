package com.daily.Oct10;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 0, 5, 5};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("By Method============================");
        sortByMethod(arr);

    }

    public static int[] sortByMethod(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i + 1] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        return arr;
    }

}
