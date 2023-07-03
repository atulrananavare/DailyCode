package com.daily.April;

import java.util.Arrays;
import java.util.HashMap;

public class NumberSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
        int[] arrrs = smallerNumbersThanCurrent(arr);
        for (int a:arrrs) {
            System.out.println(a);
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(arr[i]))
                map.put(arr[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            arr[i] = map.get(nums[i]);
        }
        System.out.println(map);
        return arr;
    }
}
