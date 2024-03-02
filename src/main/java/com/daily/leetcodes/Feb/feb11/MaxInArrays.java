package com.daily.leetcodes.Feb.feb11;

public class MaxInArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 15, 4, 6,78,98,788,90};

        System.out.println(maxInArray(arr));
        System.out.println("===============================");
        System.out.println(maxInrange(arr,1,6));
    }

    private static int maxInArray(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    //Range max
    private static int maxInrange(int[] arr,int start,int end) {
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
