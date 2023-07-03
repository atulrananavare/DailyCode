package com.daily.july;

public class LinearSearchAlgo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 9, 14, 17, 18, 19, 21, 23, 25, 78, 89, 100, 129, 230};
        LinearSearchAlgo algo = new LinearSearchAlgo();
        System.out.println(algo.linearSearch(arr, 25));
    }

    public int linearSearch(int[] arr, int numberToFind) {

        for (int low = 0; low < arr.length - 1; low++) {
            if (arr[low] == numberToFind) {
                return low;
            }
        }
        return -1;

    }
}
