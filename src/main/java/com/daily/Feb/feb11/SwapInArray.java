package com.daily.Feb.feb11;

import java.util.Arrays;

public class SwapInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 6};

        swap(arr, 2, 3);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
